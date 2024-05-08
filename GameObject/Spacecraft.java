package GameObject;

import java.util.List;

import Math.Vector2D;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Spacecraft extends CosmicObject {
    protected int lifeCapsules;
    protected int missiles;
    private int distance;

    public Spacecraft(Vector2D position, BufferedImage texture) {
        super(position, texture);
    }

    public int getDistance() {
        return distance;
    }

    public int getLifeCapsules() {
        return lifeCapsules;
    }

    public int getMissiles() {
        return missiles;
    }

    @Override
    public void update() {

    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(texture, (int)position.getX(), (int)position.getY(), null);
    }
}