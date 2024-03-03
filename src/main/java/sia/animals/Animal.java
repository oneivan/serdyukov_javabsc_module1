package sia.animals;

public abstract class Animal {
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

    public void Info () {
        System.out.printf(
                "INFO:" + "\n\tName          = " + this.name
                        + "\n\tSpeed of Run  = " + this.spdRun
                        + "\n\tSpeed of Swim = " + this.spdSwim
                        + "\n\tStamina       = " + this.stamina
                + "\n"
        );
    }
    public float run( int distance ) {
        setStamina(this.stamina - distance /* x1 */);
        actionReport("бежим как можем");
        return distance / spdRun;
    }

    abstract public float swim( int distance );

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

    public void setStamina(int stamina) {
        this.stamina = this.stamina > 0 ? stamina : -1;
    }

    protected void actionReport( String msg ) {
        System.out.println( this.name + " report : " + msg );
    }
}
