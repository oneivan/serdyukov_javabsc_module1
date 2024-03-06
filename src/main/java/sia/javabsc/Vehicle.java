package sia.javabsc;

public abstract class Vehicle {
    public abstract int Ride(int dist, RoadType rt); // return real path (km)

    public abstract String toString();

    public static void report(String msg) {
        System.out.println( "VHCL report: " + msg);
    }
}