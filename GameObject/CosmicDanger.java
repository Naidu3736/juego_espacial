package GameObject;

public class CosmicDanger extends CosmicObject {
    protected Spacecraft spacecraft; // Agregar esta línea
    private int lifeCapsulesPenalty;
    private int missilesPenalty;

    private static final int INTERACTION_DISTANCE_THRESHOLD = 1000;

    public CosmicDanger(int distance, int speed, Spacecraft spacecraft, int damage, int lifeCapsulesPenalty, int missilesPenalty) {
        this.distance = distance;
        this.speed = speed;
        this.spacecraft = spacecraft;
        this.damage = damage;
        this.lifeCapsulesPenalty = lifeCapsulesPenalty;
        this.missilesPenalty = missilesPenalty;
    }

    public void move() {
        // Supongamos que el peligro cósmico se mueve en línea recta
        // Actualizar la posición basándose en la velocidad y el tiempo transcurrido
        this.distance += this.speed; // Suponiendo que el tiempo es discreto y la velocidad es constante
    }
}