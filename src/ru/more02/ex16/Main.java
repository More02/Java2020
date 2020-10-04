package ru.more02.ex16;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите карты первого игрока");
        for (int i = 0; i < 5; i++) {
            arr1.add(in.nextInt());
        }
        System.out.println("Введите карты второго игрока");
        for (int i = 0; i < 5; i++)  {
            arr2.add(in.nextInt());
        }
        int i = 0;
        while (true) {
            if (i == 106) System.out.println("botva");
            else if ((arr1.size() != 0) && (arr2.size() != 0)) {
                if (((arr1.get(0) == 9) && (arr2.get(0) == 0))||(arr1.get(0) < arr2.get(0))) {
                    arr2.add(arr1.get(0));
                    arr2.add(arr2.get(0));
                    arr1.remove(0);
                    arr2.remove(0);
                }
                else if (((arr1.get(0) == 0) && (arr2.get(0) == 9))||(arr1.get(0) > arr2.get(0))) {
                    arr1.add(arr1.get(0));
                    arr1.add(arr2.get(0));
                    arr1.remove(0);
                    arr2.remove(0);
                }
            }
            else if (arr1.size() == 0) {
                System.out.println("second "+i);
                break;
            }
            else if (arr2.size() == 0) {
                System.out.println("first "+i);
                break;
            }
            i++;
        }
    }
}