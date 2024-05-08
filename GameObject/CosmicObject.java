package GameObject;

import java.awt.image.BufferedImage;

import Math.Vector2D;

public abstract class CosmicObject {
    protected BufferedImage texture;
    protected Vector2D position;
    protected int distance;
    protected int speed;
    protected int damage;
    protected int missilesPenalty;

    public CosmicObject() {
    }

    public abstract void interact(Spacecraft spacecraft);

    public int getDistance() {
        return distance;
    }

    public int getDamage() {
        return damage;
    }

    public int getMissilesPenalty() {
        return missilesPenalty;
    }
}