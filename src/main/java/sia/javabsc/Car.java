package sia.javabsc;

public class Car extends Vehicle {
    private static final String name = "Car";
    private static final int rate = 5; // liter/km
    private int vTank; // liter

    public Car(int vTank) {
        this.vTank = vTank;
    }

    @Override
    public int Ride(int dist, RoadType rt) {
        int realPath = vTank / rate;
        if (vTank <= 0) {
            Vehicle.report(name + " have no FUEL.." );
            return 0;
        } else if (rt != RoadType.FLATLAND) {
            Vehicle.report(name + " cant ride at " + rt );
            return 0;
        }
        if (realPath < dist) {
            vTank = 0;
            Vehicle.report("No fuel enought..");
        } else {
            vTank -= dist * rate;
            realPath = dist;
        }
        return realPath;
    }

    @Override
    public String toString() {
        return Car.name + " (tank v=" + vTank + ")";
    }
}