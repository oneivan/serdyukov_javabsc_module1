package sia.javabsc;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;

public class PhoneBook {
    private static final HashMap<String, LinkedList<String>> pb_service = new HashMap<>(7);
    private final String fio;
    private LinkedList<String> tels;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneBook phoneBook = (PhoneBook) o;
        return Objects.equals(fio, phoneBook.fio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio);
    }

    public PhoneBook(String nm, String tel) {
        this.fio = nm;
        this.tels = new LinkedList<>();
        tels.add(tel);
        pb_service.put(fio,tels);
    }

    public LinkedList<String> add(String tel){
        if (this.tels == null )
            tels = pb_service.get(this.fio);
        this.tels.add(tel);
        return tels;
    }

    public String findNameByTel( String nm ){
        for(Map.Entry<String,LinkedList<String >> entry : pb_service.entrySet() ) {
            for ( String fio : entry.getValue()) {
                if (fio.equals(nm)) return entry.getKey();
            }
        }
        return "";
    }

    public boolean containsPhoneNumber(String num ) {
        for (Map.Entry<String,LinkedList<String>> entry: pb_service.entrySet()){
            if (entry.getValue().contains(num) ) return true;
        }
        return false;
    }

    public String find/*TelByName*/( String name ) {
        StringBuffer sb = new StringBuffer("Tels for \"" + name + "\":\n");
        for ( String num : pb_service.get(name))
            sb.append('\t' + num + '\n');
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("PhoneBooks records :\n");
        for(Map.Entry<String,LinkedList<String>> entry: pb_service.entrySet()){
            sb.append("Name: " + entry.getKey() + " , telephone: " + entry.getValue() + '\n');
        }
        sb.append("Size of PhoneBook = " + pb_service.size() + " records");
        return sb.toString();
    }
}
