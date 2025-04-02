package Game;

import javax.swing.*;
import java.awt.*;


public class Main extends JFrame {

    public Main() {
        setTitle("Space Invaders");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        add(new GamePanel());
        pack();
    }
    public static void main(String[] args) {
        new Main();
    }
}

