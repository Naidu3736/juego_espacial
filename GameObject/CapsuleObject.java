package GameObject;

public class CapsuleObject extends InterestObject {
    public CapsuleObject(int distance, int capsules) {
        super(distance, capsules, 2000); // No es necesario pasar la velocidad
    }

    // Agregar el método getCapsules() para obtener el número de cápsulas
    public int getCapsules() {
        return capsules;
     }
}