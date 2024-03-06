package sia.javabsc;

public class Bike extends Vehicle {
    private static final String name = "Bike";

    @Override
    public int Ride(int dist, RoadType rt) {
        Vehicle.report("Tryng ride on " + rt);
        if (rt != RoadType.MORASS)
            return dist;
        else return 0;
    }

    @Override
    public String toString() {
        return Bike.name;
    }
}