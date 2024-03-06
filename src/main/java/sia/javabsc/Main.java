package sia.javabsc;

public class Main {
    public static void main(String[] args) {

        Human hh = new Human("Potap Turedriver");
        Truck track = new Truck (200);
        hh.startUse(track) ;
        hh.rideMore(10, RoadType.FOREST);
        hh.rideMore(500, RoadType. FOREST);
        track.showInfo();
        hh.stopUse();

        Car cc = new Car(40);
        hh.startUse(cc);
        hh.rideMore(22, RoadType.MORASS);
        hh.rideMore(5, RoadType.FLATLAND);
        hh.rideMore(6, RoadType.FLATLAND);
        hh.rideMore(11, RoadType.FLATLAND);
        hh.stopUse();

        Bike bb = new Bike();
        hh.startUse(bb);
        hh.rideMore (100, RoadType.FOREST) ;
        hh.stopUse();
        hh.rideMore(6, RoadType.MORASS );
    }
}
