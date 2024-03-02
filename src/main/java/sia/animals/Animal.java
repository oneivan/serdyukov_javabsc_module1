package sia.animals;

public class Animal {
/*
    У каждого животного есть
        имя,
        скорость бега и
        плавания (м/с), и
        выносливость (измеряется в условных единицах)
*/
    private String name;
    private float spdRun , spdSwim;
    private int stamina;

    public Animal(String name, float spdRun, float spdSwim, int stamina) {
        this.name = name;
        this.spdRun = spdRun;
        this.spdSwim = spdSwim;
        this.stamina = stamina;
    }

    public int run( int distance ) {
        int stm = this.stamina - distance /* x1 */;
        return stm < 0 ? -1 : stm;
    }
    public String getName() {
        return name;
    }

    public float getSpdRun() {
        return spdRun;
    }

    public float getSpdSwim() {
        return spdSwim;
    }

    public int getStamina() {
        return stamina;
    }
}
