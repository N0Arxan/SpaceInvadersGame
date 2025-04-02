package Game;

import Entities.SpaceShip;
import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {


    private final int FPS = 60;
    private final SpaceShip spaceShip;
    private final KeyInputHandler keyInputHandler;
    Thread gameThread;

    GamePanel() {
        setPreferredSize(new Dimension(600, 800));
        setLayout(null);
        spaceShip = new SpaceShip(300 - 25, 735);
        setFocusable(true);
        requestFocusInWindow();
        keyInputHandler = new KeyInputHandler(this.spaceShip);
        addKeyListener(keyInputHandler);
        stratGameLoop();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black);
        g.fillRect(0, 0, getWidth(), getHeight());
        spaceShip.draw(g);
    }

    public void stratGameLoop() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        double delta = (double) 1_000_000_000 / FPS;
        double nextDrawTime = System.nanoTime() + delta;

        while (gameThread.isAlive()) {
            spaceShip.update();
            repaint();

            double remainingTime = (nextDrawTime - System.nanoTime()) / 1_000_000.0;

            if (remainingTime <= 0) {
                remainingTime = 0;
            }
            try {
                Thread.sleep((long) remainingTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            nextDrawTime += delta;
        }
    }
}
