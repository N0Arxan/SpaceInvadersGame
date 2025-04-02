package Game;

import Entities.SpaceShip;
import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private final SpaceShip spaceShip;
    private KeyInputHandler keyInputHandler;

    GamePanel() {
        setPreferredSize(new Dimension(600, 800));
        spaceShip = new SpaceShip(0, 0);
        keyInputHandler = new KeyInputHandler(this.spaceShip);
        addKeyListener(keyInputHandler);
        setFocusable(true);
        requestFocusInWindow();
        Timer timer = new Timer(10 , e -> {
            spaceShip.update();
            repaint();
            System.out.println(spaceShip.getY()+" "+spaceShip.getX());
        });
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black);
        g.fillRect(0, 0, getWidth(), getHeight());
        spaceShip.draw(g);
    }
}
