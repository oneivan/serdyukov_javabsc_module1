package sia.javabsc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public String toString() {
        return name + ", " + age;
    }

}
