package ru.more02.ex25;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Scobki {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String a = input;
        Pattern pattern = Pattern.compile("\\([\\d+/*-]*\\)");
        Matcher matcher = pattern.matcher(input);
        do {
            input = matcher.replaceAll("");
            matcher = pattern.matcher(input);
        } while (matcher.find());
        //return input.matches("[\\d+/*-]*");
        if (input.matches("[\\d+/*-]*")) {
            System.out.println(a);
        }
    }

}
