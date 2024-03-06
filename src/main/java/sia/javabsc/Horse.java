package sia.javabsc;

public class Horse extends Vehicle {
    private static final String name = "Horse";
    private static final int MAXPOWER = 40;
    private static final int ratePower = 2;
    private int power;

    public Horse(int power) {
        this.power = power;
    }

    @Override
    public int Ride(int dist, RoadType rt) {
        Vehicle.report("start riding.. ");
        if (rt != RoadType.MORASS) {
            int realPath = power / ratePower;
            if (realPath < dist) {
                power = 0;
                dist = realPath;
            } else power -= dist * ratePower;
            return dist;
        }
        Vehicle.report("cant ride above " + RoadType.MORASS);
        return 0;
    }

    public void rest() {
        Vehicle.report("rest = max power");
        power = MAXPOWER;
    }

    @Override
    public String toString() {
        return name;
    }
}