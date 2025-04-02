package Assets;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Assets {
    public static BufferedImage spaceShip;

    public Assets() {
        try {
            spaceShip = ImageIO.read(new File("Resources/Images/spaceShip.png"));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
