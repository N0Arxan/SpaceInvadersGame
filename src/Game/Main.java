package Game;

import javax.swing.*;
import Assets.Assets;


public class Main extends JFrame {

    public Main() {
        setTitle("Space Invaders");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new GamePanel());
        pack();
        setLocationRelativeTo(null);
        setDefaultLookAndFeelDecorated(true);
        setResizable(false);
        setVisible(true);

    }
    public static void main(String[] args) {
        new Assets();
        new Main();
        System.out.println("Current working directory: " + System.getProperty("user.dir"));
    }
}

