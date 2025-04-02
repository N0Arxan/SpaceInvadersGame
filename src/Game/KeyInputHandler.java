package Game;
import Entities.SpaceShip;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInputHandler extends KeyAdapter {

    private final SpaceShip spaceShip;

    public KeyInputHandler(SpaceShip spaceShip) {
        this.spaceShip = spaceShip;
    }


    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_UP:
                spaceShip.setGoingUp(true);
                break;
            case KeyEvent.VK_DOWN:
                spaceShip.setGoingDown(true);
                break;
            case KeyEvent.VK_LEFT:
                spaceShip.setGoingLeft(true);
                break;
            case KeyEvent.VK_RIGHT:
                spaceShip.setGoingRight(true);
                break;
            default:
                break;
        }
    }

    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_UP:
                spaceShip.setGoingUp(false);
                break;
            case KeyEvent.VK_DOWN:
                spaceShip.setGoingDown(false);
                break;
            case KeyEvent.VK_LEFT:
                spaceShip.setGoingLeft(false);
                break;
            case KeyEvent.VK_RIGHT:
                spaceShip.setGoingRight(false);
                break;
            default:
                break;
        }
    }

}
