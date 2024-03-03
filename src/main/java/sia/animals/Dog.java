package sia.animals;

public class Dog extends Animal {

    public Dog(String name, float spdRun, float spdSwim, int stamina) {
        super(name, spdRun, spdSwim, stamina);
        actionReport( "новый пес по имени " + name );
    }

    @Override
    public float swim(int distance) {
        actionReport( "поплыл как зверь");
        setStamina( getStamina() - distance );
        return distance / getSpdSwim();
    }
}
