package sia.javabsc;

import java.util.Arrays;

/*
* Домашнее задание
* Работа с исключениями
* Цель:
* Научиться работать с исключениями
* Описание/Пошаговая инструкция выполнения домашнего задания:
* Реализуйте метод, аргументом которого является двумерный строковый массив размером 4х4.
* Если передан массив другого размера необходимо бросить исключение
* AppArraySizeException.
* Метод должен обойти все элементы массива, преобразовать в int и просуммировать.
* Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит текст вместо числа),
* должно быть брошено исключение
* AppArrayDataException
* с детализацией, в какой именно ячейке лежат неверные данные.
* В методе main() необходимо вызвать полученный метод,
* обработать возможные исключения AppArraySizeException и AppArrayDataException
* и вывести результат расчета (сумму элементов, при условии что подали на вход корректный массив).
**/
public class Main {
    private final static int RIGHTSZ=4;
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        mtdTest(arr, "");
        for (int i = 0; i < RIGHTSZ; i++) {
            System.out.println("arr = " + Arrays.toString(arr[i]));
        }

//        int[][] arrWrongSZ = new int[4][5];
//        mtdTest(arrWrongSZ, "");
/*
arr = [320, 321, 322, 323]
arr = [320, 321, 322, 323]
arr = [320, 321, 322, 323]
arr = [320, 321, 322, 323]
Exception in thread "main" sia.javabsc.AppArraySizeException: Размер массива не верный.
	at sia.javabsc.Main.mtdTest(Main.java:52)
	at sia.javabsc.Main.main(Main.java:34)
*/
        int[][] arrErrParse = new int[4][4];
        mtdTest(arrErrParse, "x");
/*
arr = [320, 321, 322, 323]
arr = [320, 321, 322, 323]
arr = [320, 321, 322, 323]
arr = [320, 321, 322, 323]
Exception in thread "main" sia.javabsc.AppArrayDataExeption: Значения в строке не INT.
	at sia.javabsc.Main.mtdTest(Main.java:64)
	at sia.javabsc.Main.main(Main.java:45)
*/
    }

    private static void mtdTest( int[][] in , String err ) throws AppArrayDataExeption, AppArraySizeException {
        if (in.length != RIGHTSZ || in[0].length != RIGHTSZ ) {
            throw new AppArraySizeException("Размер массива не верный.");
        }
        try {
            String s = "32";
            if (!err.isEmpty())
                s += err;
            for (int i = 0; i < RIGHTSZ; i++) {
                for (int j = 0; j < RIGHTSZ; j++) {
                    in[i][j] = Integer.parseInt( s + j );
                }
            }
        } catch (RuntimeException ex) {
            throw new AppArrayDataExeption("Значения в строке не INT.");

        }
    }
}