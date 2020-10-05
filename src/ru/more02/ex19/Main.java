package ru.more02.ex19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fio;
        String inn;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите фио");
        fio = in.nextLine();
        System.out.println("Введите ИНН");
        inn = in.nextLine();
        boolean result = inn.matches("([0-9]+){10}");
        if (result) {
            if(inn.charAt(0)!='0') {
                System.out.println("ИНН соответствует");
            }
            else {
                System.out.println("ИНН не соответствует");
            }

        }
        else {
            System.out.println("ИНН не соответствует");
        }
    }
}
