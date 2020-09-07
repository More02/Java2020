package ru.more02.ex1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        prog3();
        prog4(args);
        prog5();
        prog6();
        prog7();
    }

    public static void prog3() {
        System.out.println("Exercise 3");
        int[] arr = {2, 3, 4, 5};
        int summ1 = 0;
        int summ2 = 0;
        int summ3 = 0;
        for (int i = 0; i < arr.length; i++) {
            summ1 += arr[i];
        }
        System.out.println(summ1);

        int j = 0;
        while (j < arr.length) {
            summ2 += arr[j];
            j++;
        }
        System.out.println(summ2);

        int k = 0;
        do {
            summ3 += arr[k];
            k++;
        } while (k < arr.length);
        System.out.println(summ3);
    }

    public static void prog4(String[] args) {
        System.out.println("Exercise 4");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

    public static void prog5() {
        System.out.println("Exercise 5");
        double varr = 0;
        for (int i = 1; i < 11; i++) {
            varr = 1.0 / i;
            String s = String.format("%.3f", varr);
            System.out.print(s+" ");
        }
    }

    public static void prog6() {
        System.out.println("Exercise 6");
        double[] arr2 = new double[4];
        //вариант 1

        System.out.println("Вариант 1");
        System.out.println("Исходный массив");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Math.random();
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        System.out.println("Отсортированный массив");
        for (int i = 0; i < arr2.length - 1; i++) {
            for (int j = arr2.length - 1; j > i; j--) {
                if (arr2[j - 1] > arr2[j]) {
                    double tmp = arr2[j - 1];
                    arr2[j - 1] = arr2[j];
                    arr2[j] = tmp;
                }
            }
        }
        for (int i = 0; i <arr2.length ; i++) {
            System.out.print(arr2[i]+" ");
        }
        //вариант 2
        double[] arr3 = new double[4];
        System.out.println();
        System.out.println("Вариант 2");
        System.out.println("Исходный массив");
        Random rnd = new Random();
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = rnd.nextDouble();
            System.out.print(arr3[i]+" ");
        }
        System.out.println();
        System.out.println("Отсортированный массив");
        for (int i = 0; i < arr3.length - 1; i++) {
            for (int j = arr3.length - 1; j > i; j--) {
                if (arr3[j - 1] > arr3[j]) {
                    double tmp = arr3[j - 1];
                    arr3[j - 1] = arr3[j];
                    arr3[j] = tmp;
                }
            }
        }
        for (int i = 0; i <arr3.length ; i++) {
            System.out.print(arr3[i]+" ");
        }


    }
    public static void prog7() {
        System.out.println();
        System.out.println("Exercise 7");
        int m = 10;
        System.out.println(factt(m));

    }
    public static int factt(int m) {
        int fact=1;
        for (int i = 1; i <=m ; i++) {
            fact*=i;
        }
        return fact;
    }

}
