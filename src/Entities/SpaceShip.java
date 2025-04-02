package Entities;

import java.awt.*;

public class SpaceShip {
    private boolean GoingUp,GoingDown,GoingRight,GoingLeft;
    private int x,y;
    private final int speed = 1;
    private final int width = 10;
    private final int height = 10;


    public SpaceShip(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(x, y, width, height);
    }

    public void update() {
        if (GoingUp) {
            y -= speed;
        }
        if (GoingDown) {
            y += speed;
        }
        if (GoingRight) {
            x += speed;
        }
        if (GoingLeft) {
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
