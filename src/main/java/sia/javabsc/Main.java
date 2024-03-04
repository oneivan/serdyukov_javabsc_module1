package sia.javabsc;

public class Main {
    public static void main(String[] args) {
        Plate p = new Plate(30);
        Cat[] cats = {
                new Cat("Barsik", 11), new Cat("Sema", 15)
                , new Cat("Gans", 6), new Cat("Landay", 2), new Cat("Livshic", 22)
        };
        for (int i = 0; i < cats.length; i++) {
            cats[i].Eat(p);
        }
        for (int i = 0; i < cats.length; i++) {
            cats[i].showInfo();
        }
        System.out.println("Несъедено " + p.getCrntAmt());
    }
}