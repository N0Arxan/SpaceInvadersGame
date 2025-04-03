package Assets;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Assets {
    public static List<BufferedImage> spaceShipN = new ArrayList<>() ;
    public static List<BufferedImage> spaceShipA = new ArrayList<>() ;
    public static List<BufferedImage> LasersImages = new ArrayList<>();
    public static List<BufferedImage> Plant = new ArrayList<>() ;
    public static List<BufferedImage> noisesOfPlanet = new ArrayList<>();


    public Assets() {
        try {
            spaceShipN.add(ImageIO.read(new File("Resources/Images/SpaceShip/normal/normal0.png")));
            spaceShipN.add(ImageIO.read(new File("Resources/Images/SpaceShip/normal/normal1.png")));
            spaceShipN.add(ImageIO.read(new File("Resources/Images/SpaceShip/normal/normal2.png")));
            spaceShipN.add(ImageIO.read(new File("Resources/Images/SpaceShip/normal/normal3.png")));

            spaceShipA.add(ImageIO.read(new File("Resources/Images/SpaceShip/accelerated/accelerated0.png")));
            spaceShipA.add(ImageIO.read(new File("Resources/Images/SpaceShip/accelerated/accelerated1.png")));
            spaceShipA.add(ImageIO.read(new File("Resources/Images/SpaceShip/accelerated/accelerated2.png")));
            spaceShipA.add(ImageIO.read(new File("Resources/Images/SpaceShip/accelerated/accelerated3.png")));

            LasersImages.add(ImageIO.read(new File("Resources/Images/Lasers/blue-plasma.png")));


            Plant.add(ImageIO.read(new File("Resources/Images/Planet/planet00.png")));

            int fd = 0;
            int sd = 0;
            String path = String.format("Resources/Images/Planet/Noises/noise%d%d.png",fd,sd);
            noisesOfPlanet.add(ImageIO.read(new File(path)));
            for (int i = 0; i < 27; i++) {
                sd++;
                if (sd >= 10){
                    sd = 0;
                    fd++;
                }
                path = String.format("Resources/Images/Planet/Noises/noise%d%d.png",fd,sd);
                noisesOfPlanet.add(ImageIO.read(new File(path)));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
