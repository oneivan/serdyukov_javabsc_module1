package sia.javabsc;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(sumOfPositiveElements(new int[][] { {1,2,3},{2,3,6},{4,4,-5}}) ); // 30-5
        System.out.println(drawSquare(5) );

        int[][] arr = { {3,2,1} , {2,5,67} , {8,6,4} };
        zeroarr( arr );
        for (int i = 0; i < arr[0].length; i++) {
            System.out.println(Arrays.toString( arr[i] ) );
        }

        System.out.println(findMax( arr ) );
    }
/*
Описание/Пошаговая инструкция выполнения домашнего задания:
sumOfPositiveElements - Реализовать метод sumOfPositiveElements(..), принимающий в качестве аргумента целочисленный двумерный массив, метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0;
drawSquare            - Реализовать метод, который принимает в качестве аргумента int size и печатает в консоль квадрат из символов * со сторонами соответствующей длины;
zeroarr               - Реализовать метод, принимающий в качестве аргумента двумерный целочисленный массив, и зануляющий его диагональные элементы (можете выбрать любую из диагоналей, или занулить обе);
Реализовать метод findMax(int[][] array) который должен найти и вернуть максимальный элемент массива;
Реализуйте метод, который считает сумму элементов второй строки двумерного массива, если второй строки не существует, то в качестве результата необходимо вернуть -1
Домашнее задание сдается через Pull Request
 */
    public static int sumOfPositiveElements( int[][] arr ) {
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += Math.max(arr[i][j] , 0) ;
            }
        }
        return sum;
    }
    public static String drawSquare( int h ) {
        String a = "", b = "";
        for (int i = 0; i < h; i++) { a += '*'; };
        for (int i = 0; i < h; i++) {
            b += a + '\n';
        }
        return b;
    }
    
    public static void zeroarr( int[][] arr ) {
        int dgn = Math.min(arr.length,arr[0].length);
        for (int i = 0; i < dgn; i++) {
            arr[i][i] = 0;
        }
    }

    public static int findMax( int[] [] arr ) {
        int mx = 0;
        for (int i = 0; i < arr[0].length; i++) {
            Arrays.
        }
        return mx;
    }

}