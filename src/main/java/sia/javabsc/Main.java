package sia.javabsc;

public class Main {
/*
/Library/Java/JavaVirtualMachines/openjdk-17.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=64669:/Applications/IntelliJ IDEA CE.app/Contents/bin -Dfile.encoding=UTF-8 -classpath /Users/oneivan/edq/o2s/java/bsc/serdyukov_javabsc_module1/target/classes sia.javabsc.Main
PB = PhoneBooks records :
Name: FIO A , telephone: [1112233, 1124433, 1124435, 1124437]
Name: YYYY , telephone: [null]
Name: FIO B , telephone: [888777665, 3335566, 9997744]
Size of PhoneBook = 3 records
Tel = 1124435 -- Name = FIO A
Name = FIO A -- Tel list = Tels for "FIO A":
	1112233
	1124433
	1124435
	1124437

Check phone in book : 9997744 -  in Book
Check phone in book : 0997744 - not in Book

Process finished with exit code 0
*/
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook("FIO A", "1112233");
        pb.add("1124433");
        pb.add("1124435");
        pb.add("1124437");

        new PhoneBook("FIO B" , "888777665").add("3335566").add( "9997744");

        new PhoneBook("YYYY",null);

        System.out.println("PB = " + pb );
        System.out.println("Tel = 1124435 -- Name = " + pb.findNameByTel("1124435"));
        System.out.println("Name = FIO A -- Tel list = " + pb.find("FIO A") );
        System.out.println("Check phone in book : 9997744 - " + (pb.containsPhoneNumber("9997744")?" in Book": "not in Book"));
        System.out.println("Check phone in book : 0997744 - " + (pb.containsPhoneNumber("0997744")?" in Book": "not in Book"));
    }
}