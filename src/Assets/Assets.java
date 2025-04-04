package Assets;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Assets {
    public static List<BufferedImage> spaceShipN = new ArrayList<>() ;
    public static List<BufferedImage> spaceShipA = new ArrayList<>() ;
    public static List<BufferedImage> lasersImages = new ArrayList<>();
    public static List<BufferedImage> plants = new ArrayList<>() ;
    public static List<BufferedImage> noisesOfPlanet = new ArrayList<>();
    public static List<BufferedImage> bgImages  = new ArrayList<>() ;


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

            lasersImages.add(ImageIO.read(new File("Resources/Images/Lasers/blue-plasma.png")));


            plants.add(ImageIO.read(new File("Resources/Images/Planet/planet00.png")));

            int fd = 0; //fir
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

            fd = 0;
            sd = 0;
            path = String.format("Resources/Images/Background/sprite_bg%d%d.png",fd,sd);
            System.out.println("ok");
            bgImages.add(ImageIO.read(new File(path)));
            for (int i = 0; i < 12; i++) {
                sd++;
                if (sd >= 10){
                    sd = 0;
                    fd++;
                }
                path = String.format("Resources/Images/Background/sprite_bg%d%d.png",fd,sd);
                bgImages.add(ImageIO.read(new File(path)));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
