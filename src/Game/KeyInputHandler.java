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
        if (keyCode == KeyEvent.VK_RIGHT){
            spaceShip.setGoingRight(true);
        }
        if (keyCode == KeyEvent.VK_LEFT) {
            spaceShip.setGoingLeft(true);
        }
        if (keyCode == KeyEvent.VK_UP) {
            spaceShip.setGoingUp(true);
        }
        if (keyCode == KeyEvent.VK_DOWN) {
            spaceShip.setGoingDown(true);
        }
    }

    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_RIGHT){
            spaceShip.setGoingRight(false);
        }
        if (keyCode == KeyEvent.VK_LEFT) {
            spaceShip.setGoingLeft(false);
        }
        if (keyCode == KeyEvent.VK_UP) {
            spaceShip.setGoingUp(false);
        }
        if (keyCode == KeyEvent.VK_DOWN) {
            spaceShip.setGoingDown(false);
        }
    }

}
