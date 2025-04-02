package Entities;

import Assets.Assets;

import java.awt.*;
import java.awt.image.BufferedImage;

public class SpaceShip {
    private boolean GoingUp,GoingDown,GoingRight,GoingLeft;
    private int x,y;
    private final int speed = 5;
    private final int width = 48;
    private final int height = 64;
    private BufferedImage image = Assets.spaceShip;

    public SpaceShip(int x, int y ) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(x, y, width, height);
        g.drawImage(image, x, y, null);
    }

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

    public int getX() { return x; }

    public int getY() { return y; }

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
