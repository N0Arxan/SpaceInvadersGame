package Entities;

import Assets.Assets;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.List;

public class SpaceShip extends Entity implements EntityInterface {
    private boolean GoingUp, GoingDown, GoingRight, GoingLeft;
    private final List<BufferedImage> imagesN = Assets.spaceShipN;
    private final List<BufferedImage> imagesA = Assets.spaceShipA;
    private int FrameCount = 0;
    private int spriteNum = 0;

    public SpaceShip(int x, int y) {
        super(x,y);
        speed = 5;
        width = 50;
        height = 70;
    }

    @Override
    public void draw(Graphics g) {
        if (GoingUp) {
            animateSprites(g, imagesA);
        } else {
            animateSprites(g, imagesN);
        }
    }

    private void animateSprites(Graphics g, List<BufferedImage> images) {
        g.drawImage(images.get(spriteNum), x, y, null);
        if (spriteNum == imagesN.size() - 1) {
            spriteNum = 0;
        }
        FrameCount++;
        if (FrameCount > 10) {
            spriteNum++;
            FrameCount = 0;
        }
    }

    @Override
    public void update() {
        if (GoingUp && y > 560) {
            y -= speed;
        }
        if (GoingDown && y < 735) {
            y += speed;
        }
        if (GoingRight && x < 550) {
            x += speed;
        }
        if (GoingLeft && x > 0) {
            x -= speed;
        }
    }

    public void setGoingUp(boolean goingUp) {
        GoingUp = goingUp;
    }

    public void setGoingDown(boolean goingDown) {
        GoingDown = goingDown;
    }

    public void setGoingRight(boolean goingRight) {
        GoingRight = goingRight;
    }

    public void setGoingLeft(boolean goingLeft) {
        GoingLeft = goingLeft;
    }
}
