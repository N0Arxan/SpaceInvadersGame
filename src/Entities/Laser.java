package Entities;
import Assets.Assets;
import java.awt.*;

public class Laser extends Entity implements EntityInterface {


    private int FrameCount = 0;
    private boolean isDestroyed = false;

    public Laser(int x, int y) {
        super(x, y);
        speed = 15;
        width = 10;
        height = 44;
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(Assets.lasersImages.getFirst(), x, y, null);
    }

    @Override
    public void update() {
        y -= speed;
    }


}
