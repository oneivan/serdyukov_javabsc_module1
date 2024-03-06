package sia.javabsc;

public class Truck extends Vehicle {
    private static final String name = "Truck";
    private static final int rate = 10; //  liter / km
    private int vTank; //  liter

    public Truck(int tank) {
        vTank = tank;
    }

    @Override
    public int Ride(int dist, RoadType rt) {
        if (vTank <= 0) {
            Vehicle.report("no more fuel");
            return 0;
        }
        int realPath = vTank / rate;
        Vehicle.report("realPath = " + realPath); // just for test purpose
        if (realPath < dist) {
            vTank = 0;
            dist = realPath;
            Vehicle.report("we have no fuel enought ! realpath = " + realPath );
        } else
            vTank -= dist * rate;
        return dist;
    }

    public void showInfo() {
        String msg = "Info from " + name
                + "\n\tvTank = " + vTank
                + "\n\trate = " + rate;
        Vehicle.report(msg);
    }

    @Override
    public String toString() {
        return Truck.name;
    }
}