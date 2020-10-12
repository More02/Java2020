package ru.more02.ex25;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPAdress {


    public static void main(String[] args) {
        String regexp = "(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
        System.out.println("Введите IP адреса");
        Scanner in = new Scanner(System.in);
        String goodIp = in.nextLine();
        if (goodIp.matches(regexp)) {
            System.out.println("IP адрес верный");
        }
        else {
            System.out.println("IP адрес неверный");
        }
    }
}
