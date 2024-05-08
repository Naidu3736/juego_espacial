package GameObject;

public abstract class InterestObject extends CosmicObject {
    protected int capsules;
    protected int distanceLimit;

    public InterestObject(int speed, int capsules, int distanceLimit) {
        this.speed = speed;
        this.capsules = capsules;
        this.distanceLimit = distanceLimit;
    } 
}