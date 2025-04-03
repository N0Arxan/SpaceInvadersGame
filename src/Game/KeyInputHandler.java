package Game;
import Entities.Laser;
import Entities.SpaceShip;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInputHandler extends KeyAdapter {

    private final GamePanel gamePanel;

    public KeyInputHandler(SpaceShip spaceShip, GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }


    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_RIGHT){
            gamePanel.getSpaceShip().setGoingRight(true);
        }
        if (keyCode == KeyEvent.VK_LEFT) {
            gamePanel.getSpaceShip().setGoingLeft(true);
        }
        if (keyCode == KeyEvent.VK_UP) {
            gamePanel.getSpaceShip().setGoingUp(true);
        }
        if (keyCode == KeyEvent.VK_DOWN) {
            gamePanel.getSpaceShip().setGoingDown(true);
        }
        if (keyCode == KeyEvent.VK_SPACE) {
            int x = gamePanel.getSpaceShip().getX();
            int y = gamePanel.getSpaceShip().getY();

            gamePanel.addLaser(new Laser(x + 20,y - 37));
        }
    }

    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_RIGHT){
            gamePanel.getSpaceShip().setGoingRight(false);
        }
        if (keyCode == KeyEvent.VK_LEFT) {
            gamePanel.getSpaceShip().setGoingLeft(false);
        }
        if (keyCode == KeyEvent.VK_UP) {
            gamePanel.getSpaceShip().setGoingUp(false);
        }
        if (keyCode == KeyEvent.VK_DOWN) {
            gamePanel.getSpaceShip().setGoingDown(false);
        }
    }

}
