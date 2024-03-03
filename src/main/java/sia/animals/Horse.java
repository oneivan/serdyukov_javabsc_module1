package sia.animals;

public class Horse extends  Animal {
    public Horse(String name, float spdRun, float spdSwim, int stamina) {
        super(name, spdRun, spdSwim, stamina);
        actionReport( "новый конь по имени " + name );

    }

    @Override
    public float swim(int distance) {
        actionReport( "поплыл коник");
        setStamina( getStamina() - distance );
        return distance / getSpdSwim();
    }
}
