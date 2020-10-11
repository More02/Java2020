package ru.more02.ex24;

import java.util.Scanner;

public class Number {
    public String last4=new String();
    public String last3=new String();
    public String first3=new String();
    public String kode=new String();


    public void convert (String s) {
        for (int i = s.length()-1-3; i <s.length(); i++) {
            last4+=Character.toString(s.charAt(i));
        }
        for (int i = s.length()-1-3-3; i <s.length()-4; i++) {
            last3+=String.valueOf(s.charAt(i));
        }
        for (int i = s.length()-1-3-3-3; i <s.length()-4-3; i++) {
            first3+=String.valueOf(s.charAt(i));
        }
        if (s.charAt(0)!='+') {
            kode+='7';
            for (int i = 1; i <s.length()-1-3-3-3; i++) {
                kode+=String.valueOf(s.charAt(i));
            }
        }
        else {
            for (int i = 1; i <s.length()-1-3-3-3; i++) {
                kode+=String.valueOf(s.charAt(i));
            }
        }

        System.out.println("+"+kode+first3+"-"+last3+"-"+last4);
    }

    public static void main(String[] args) {
        Number number = new Number();
        System.out.println("Введите номер");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println("После конвертации");
        number.convert(str);


    }
}
