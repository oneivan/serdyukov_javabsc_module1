package sia.javabsc;

public class Plate {
    private int mxCap;
    private int crntAmt;

    public Plate(int mxCap) {
        this.mxCap = mxCap;
        this.crntAmt = mxCap;
    }

    public int addFood(int amt) {
        crntAmt = Math.min(mxCap, crntAmt + amt);
        return crntAmt;
    }

    public boolean Hroom(int amt) {
        boolean res = ((crntAmt - amt) >= 0);
        crntAmt = Math.max(crntAmt - amt, 0);
        return res;
    }

    public int getCrntAmt() {
        return this.crntAmt;
    }
}