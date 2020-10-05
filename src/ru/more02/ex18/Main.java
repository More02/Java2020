package ru.more02.ex18;

import java.util.Scanner;

public class Main {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        try {
            if (2.0/i==Float.POSITIVE_INFINITY) {
                System.out.println("Получена бесконечность");
            }
            else {
                System.out.println(2.0/i);
            }
        } catch (Exception e) {
            e.getMessage();
            System.out.println("На ноль делить нельзя");
        }


    }
    public static void main(String[] args) {
        Main main = new Main();
        main.exceptionDemo();
    }
}
