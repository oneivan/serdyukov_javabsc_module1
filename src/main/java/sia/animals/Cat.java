package sia.animals;

public class Cat extends  Animal {
    public Cat(String name, float spdRun, int stamina) {
        super(name, spdRun, 0, stamina);
        actionReport( "новый кот по имени " + name );
    }

    @Override
    public float swim(int distance) {
        actionReport( "этим не занимаюсь");
        return -1;
    }
}
