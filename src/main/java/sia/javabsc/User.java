package sia.javabsc;

public class User {
    private String fName;
    private String iName;
    private String oName;
    private int bdayYY;
    private String email;

    public User(String fName, String iName, String oName, int bdayYY, String email) {
        this.fName = fName;
        this.iName = iName;
        this.oName = oName;
        this.bdayYY = bdayYY;
        this.email = email;
    }

    public void getInfo() {
        System.out.printf("ФИО: %s %s %s\n", this.fName, this.iName, this.oName);
        System.out.println("Год рождения: " + this.bdayYY);
        System.out.println("e-mail: : " + this.email);
    }

    public int getBDY() {
        return this.bdayYY;
    }
}
