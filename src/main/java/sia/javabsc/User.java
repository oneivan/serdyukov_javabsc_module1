package sia.javabsc;

public class User {
    private String f_name;
    private String i_name;
    private String o_name;
    private int bday_yy;
    private String email;

    public User( String f_name, String i_name, String o_name, int bday_yy, String email ) {
        this.f_name = f_name;
        this.i_name = i_name;
        this.o_name = o_name;
        this.bday_yy = bday_yy;
        this.email = email;
    }

    public void getInfo() {
        System.out.printf( "ФИО: %s %s %s\n", this.f_name, this.i_name, this.o_name );
        System.out.println("Год рождения: " + this.bday_yy );
        System.out.println("e-mail: : " + this.email );
    }
    public int getBDY() { return  this.bday_yy; }
}
