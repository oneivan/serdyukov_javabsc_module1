package sia.javabsc;

import java.util.*;

/*
Описание/Пошаговая инструкция выполнения домашнего задания:

arrFill - Реализуйте метод, принимающий в качестве аргументов числа min и max, и возвращающий ArrayList с набором последовательных значений в указанном диапазоне (min и max включительно, шаг - 1);
arrSumm - Реализуйте метод, принимающий в качестве аргумента список целых чисел, суммирующий все элементы, значение которых больше 5, и возвращающий сумму;
arrInit - Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список, метод должен переписать каждую заполненную ячейку списка указанным числом;
arrIncc - Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список, увеличивающий каждый элемент списка на указанное число;

Создайте класс Сотрудник с полями: имя, возраст;
Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий список их имен;
Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный возраст, и возвращающий список сотрудников, возраст которых больше либо равен указанному аргументу;
Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный средний возраст, и проверяющий что средний возраст сотрудников превышает указанный аргумент;
Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий ссылку на самого молодого сотрудника.

 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        List<Integer> arr = main.arrFill(11, 33);
        System.out.println(arr);
        main.arrInit(arr, -22);
        System.out.println(arr);
        main.arrIncc(arr, -8);
        System.out.println(arr);

        main.testClassStudent();
    }

    protected List<Integer> arrFill(int mmin, int mmax) {
        if (mmin > mmax) return null;
        int sz = mmax - mmin;
        ArrayList<Integer> arr = new ArrayList<Integer>(sz);
        for (int i = 0; i < sz; i++) {
            arr.add(mmin++);
        }
        return arr;
    }

    protected int arrSumm(List<Integer> arr) {
        //  Реализуйте метод, принимающий в качестве аргумента список целых чисел, суммирующий все элементы, значение которых больше 5, и возвращающий сумму;
        int summ = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 5) {
                summ += arr.get(i);
            }
        }
        return summ;
    }

    protected void arrInit(List<Integer> arr, int a) {
        for (int i = 0; i < arr.size(); i++) {
            arr.set(i, a);
        }
    }

    protected void arrIncc(List<Integer> arr, int inc) {
        for (int i = 0; i < arr.size(); i++) {
            arr.set(i, arr.get(i) + inc);
        }
    }

    protected void testClassStudent() {
        List<Student> arr = new ArrayList<>(Arrays.asList(
                new Student("Ash", 18),
                new Student("Joe", 28),
                new Student("Sam", 22),
                new Student("Ann", 19)
        ));
        List<String> nm = getStudName(arr);
        System.out.println(Arrays.toString(nm.toArray()));

        List<Student> olders = getStudByAge(arr, 18);
        System.out.println("Students возраст больше данного (18) : " + olders);

        List<Student> avgolders = getAvgSuds(arr);
        System.out.println("Students у кого возраст больше среднего : " + avgolders);

        System.out.println(getMinAgeStudent(arr));
    }

    protected List<String> getStudName(List<Student> studs) {
        List<String> arr = new ArrayList<String>(studs.size());
        for( Student stud : studs ){
            arr.add(stud.getName());
        }
        return arr;
    }

    protected List<Student> getStudByAge(List<Student> studs, float minage) {
        List<Student> arr = new ArrayList<Student>();
        for (int i = 0; i < studs.size(); i++) {
            if (studs.get(i).getAge() > minage) {
                arr.add(studs.get(i));
            }
        }
        return arr;
    }

    protected float getStudAvgAge(List<Student> studs) {
        int sum = 0;
        for (Student stud : studs) {
            sum += stud.getAge();
        }
        float avg = sum / studs.size();
        System.out.println("средний возраст : " + avg);
        return avg;
    }

    protected List<Student> getAvgSuds(List<Student> arr) {
        return getStudByAge(arr, getStudAvgAge(arr));
    }

    protected Student getMinAgeStudent(List<Student> studs) {
        studs.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        return studs.get(0);
    }
}