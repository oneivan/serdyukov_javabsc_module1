package sia.javabsc;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        halfSumArr(new int[] {3,2,1,4,3,4 } );
        chkArrPoit( new int[] {1,1,1,3});
        chkArrPoit( new int[] {1,1,1,1,1,5});
        chkArrPoit( new int[] {1,1,1,1,1,6});
        chkArrPoit( new int[] {5,3,4,-2});
    }

    /*
    Lesson 5. HW 2

- prnStrMTimes - Реализуйте метод, принимающий в качестве аргументов целое число и строку, и печатающий в консоль строку указанное количество раз
- sumArrBig5   - Реализуйте метод, принимающий в качестве аргумента целочисленный массив, суммирующий все элементы, значение которых больше 5, и печатающий полученную сумму в консоль.
- substArrElm  - Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив, метод должен заполниться каждую ячейку массива указанным числом.
- incArrElm    - Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив, увеличивающий каждый элемент которого на указанное число.
- halfSumArr   - Реализуйте метод, принимающий в качестве аргумента целочисленный массив, и печатающий в консоль сумма элементов какой из половин массива больше.
Домашнее задание сдается через Pull Request

(*) реализуйте метод, проверяющий что есть "точка" в массиве, в которой сумма левой и правой части равны. Точка находится м/у элементами
- chkArrPoit

    */
    public static void chkArrPoit( int[] arr ) {
        int sum_i = 0, sum_j = 0;
        boolean has_point = false;
        int i = 0, j=arr.length-1;
        for ( ; i < j+1; i++) { /* TODO: что за "enchanced" FOR ? */
            sum_i += arr[i];
            for ( ; j>= 0 && sum_j < sum_i; j--) {
                sum_j = arr[j];
            }
            if (sum_j == sum_i ) { has_point = true; break; }
        }
        System.out.println("Point = " + has_point );
        System.out.printf("sum_i = %d , sum_j = %d , point = %d\n", sum_i,sum_j, (has_point ? Math.max(j,i) : -1) );
    }

    public static void prnStrMTimes(int M, String str ) {
        for (int i = 0; i < M; i++) {
            System.out.println(str);
        }
    }
    public static void sumArrBig5( int[] arr ){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            /* TODO: C/C++ кажется можно внутри FOR объявлять переменные и они будут видны вне(после) блока for
             */
            if (arr[i] > 5) sum+=arr[i];
        }
        System.out.println("Sum arr elms bigger thn 5 = " + sum );
    }

    public static void substArrElm( int new_val , int[] arr ) {
        for (int i = 0; i < arr.length; i++) { /* TODO: Array.fill ? hint by Idea */
            arr[i] = new_val;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void incArrElm( int inc_val , int[] arr ) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += inc_val;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void halfSumArr( int[] arr ) {
        int sum_1st =0 , sum_2nd = 0;
        for (int i = 0; i < arr.length; i++) {
            if ( i < arr.length / 2 ) sum_1st += arr[i];
            else sum_2nd += arr[i];
        }
        System.out.println("1st half sum = " + sum_1st + "\n2nd half sum = " + sum_2nd );
    }
}