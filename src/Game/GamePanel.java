package Game;

import Entities.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GamePanel extends JPanel implements Runnable {


    private final int FPS = 60;
    private final SpaceShip spaceShip = new SpaceShip(300 - 25, 735);
    private final SpaceBg spaceBg = new SpaceBg(0,0,getWidth(),getHeight());
    private final KeyInputHandler keyInputHandler;
    private List<Laser> lasers = new ArrayList<>();
    private List<Planet> planets = new ArrayList<>();
    Thread gameThread;

    GamePanel() {
        setPreferredSize(new Dimension(600, 800));
        setLayout(null);
        setFocusable(true);
        requestFocusInWindow();
        keyInputHandler = new KeyInputHandler(spaceShip, this);
        planets.add(new Planet(225, 0));
        addKeyListener(keyInputHandler);
        stratGameLoop();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillRect(0, 0, getWidth(), getHeight());

        spaceBg.draw(g);
        spaceShip.draw(g);

        for (Laser laser : lasers) {
            laser.draw(g);
        }
        for (Planet planet : planets) {
            planet.draw(g);
        }
    }

    public void stratGameLoop() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    public void update() {
        spaceShip.update();

        for (Laser laser : lasers) {
            laser.update();
        }
        removeLasers(lasers);

        for (Planet planet : planets) {
            planet.update();
        }
    }

    public SpaceShip getSpaceShip() {
        return spaceShip;
    }

    public void addLaser(Laser laser) {
        lasers.add(laser);
    }

    public void removeLasers(List<Laser> lasers) {
        lasers.removeIf(laser -> laser.getY() < -10);
    }

    @Override
    public void run() {
        double delta = (double) 1_000_000_000 / FPS;
        double nextDrawTime = System.nanoTime() + delta;

        while (gameThread.isAlive()) {
            update();
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
