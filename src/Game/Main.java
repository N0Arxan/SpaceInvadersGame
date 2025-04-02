package Game;

import javax.swing.*;
import java.awt.*;


public class Main extends JFrame {

    public Main() throws HeadlessException {
        setTitle("Space Invaders");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new GamePanel());
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Main();
    }
}

