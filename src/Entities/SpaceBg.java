package Entities;

import Assets.Assets;

import java.awt.*;

public class SpaceBg extends Entity implements EntityInterface {
    private int frameCounter = 0;
    private int spriteCounter = 0;


    public SpaceBg(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(Assets.bgImages.get(spriteCounter), x, y, null);
        if (spriteCounter == Assets.bgImages.size() - 1) {
            spriteCounter = 0;
        }
        frameCounter++;
        if (frameCounter > 8) {
            spriteCounter++;
            frameCounter = 0;
        }
    }

    @Override
    public void update() {
        // it will not update for now
    }
}
