package sia.javabsc;

public class Human {
    private final String name;
    private Vehicle vhcInUse;

    public Human(String nm) {
        this.name = nm;
        this.vhcInUse = null;
    }

    private void report(String msg) {
        System.out.println("Report form " + this.name + ": \n\t" + msg);
    }

    public boolean startUse(Vehicle vv) {
        Vehicle.report(vv.toString() + " start in use...");
        boolean res = vhcInUse == null; // then start using
        if (res)
            vhcInUse = vv;
        else
            report("cant use new " + vv );
        return res;
    }

    public void rideMore(int dist, RoadType rt) {
        if (vhcInUse == null) {
            report(this.name
                    + " WALKING " + " for " + dist + " km more in " + rt);
        } else {
            report(this.name
                    + " try go by " + vhcInUse.toString() + " for " + dist + " km more in " + rt);
            vhcInUse.Ride(dist, rt);
        }
    }

    public void stopUse() {
        report(this.name + " stop use vv " + vhcInUse);
        vhcInUse = null;
    }
}