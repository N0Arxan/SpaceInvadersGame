package Entities;

import Assets.Assets;

import java.awt.*;

public class Planet extends Entity implements EntityInterface {
    private int frameCountForDraw = 0;
    private int frameCountForUpdate = 0;
    private int spriteNum = 0;

    public Planet(int x, int y) {
        super(x, y);
        speed = 1;
        width = 150;
        height = 150;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.red);
        //g.fillOval(x, y, width, height);
        g.drawImage(Assets.plants.getFirst(), x, y, null);

        g.drawImage(Assets.noisesOfPlanet.get(spriteNum), x, y, null);
        if (spriteNum == Assets.noisesOfPlanet.size() - 1) {
            spriteNum = 0;
        }
        frameCountForDraw++;
        if (frameCountForDraw > 10) {
            spriteNum++;
            frameCountForDraw = 0;
        }

    }

    @Override
    public void update() {
        frameCountForUpdate++;
        if (frameCountForUpdate > 5) {
            y += speed;
            frameCountForUpdate = 0;
        }

    }
}
