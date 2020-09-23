package ru.more02.ex10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        pr1();
        pr2();
        pr3();
        pr4();
        pr5();
        pr6();
        pr7();
        pr8();
        pr9();
        pr10();
        pr11();
        pr12();
        pr13();
        pr14();
        pr15();
        pr16();
        pr17();
    }
    public static void pr1() {
        System.out.println("Задание 1");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count=0;
        for (int i = 1; i <= n; i++) {
            while (count!=i) {
                System.out.print(i+" ");
                count++;
            }
            count=0;
        }
    }
    public static void pr2() {
        System.out.println();
        System.out.println("Задание 2");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <=n; i++) {
            System.out.print(i+" ");
        }
    }
    public static void pr3() {
        System.out.println();
        System.out.println("Задание 3");
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        if (A<B) {
            for (int i = A; i <=B ; i++) {
                System.out.print(i+" ");
            }
        }
        else if (A>=B) {
            for (int i = A; i >=B ; i--) {
                System.out.print(i+" ");
            }
        }
    }
    public static void pr4() {
        System.out.println();
        System.out.println("Задание 4");
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int k = in.nextInt();
        int k2=0;
        int quantity=0;

        for (int i = (int)Math.pow(10, k-1); i < Math.pow(10, k); i++){
            int summa_number=0;
            k2=i;
            while (k2!=0) {
                summa_number+=k2%(10);
                k2/=10;
            }
            if (summa_number == s) {
                quantity++;
            }

        }
        System.out.println(quantity);

    }
    public static void pr5() {
        System.out.println();
        System.out.println("Задание 5");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum=0;
        System.out.println(recurs5(n));
    }
    public static int recurs5(int n) {
        if (n == 0)
            return 0;
        return (n % 10 + recurs5(n / 10));

    }
    public static void pr6() {
        System.out.println();
        System.out.println("Задание 6");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i=2;
        recurs6(n, i);
    }
    public static int recurs6(int n, int i) {
        if (n < 2) {
            System.out.println("NO");
        }
        else if (n == 2) {
            System.out.println("YES");
        }
        else if (n % i == 0) {
            System.out.println("NO");
        }
        else if (i < Math.sqrt(n)) {
            return recurs6(n, i + 1);
        } else {
            System.out.println("YES");
        }
        return 0;
    }
    public static void pr7() {
        System.out.println();
        System.out.println("Задание 7");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i=2;
        for (int j = 1; j <= n/2; j++) {
            if (recurs7(j, i)==1) {
                if (n%j==0) {
                    System.out.print(j+" ");
                }
            }
        }
    }
    public static int recurs7(int n, int i) {
        if (n < 2) {
            return 0;
        }
        else if (n == 2) {
            return 1;
        }
        else if (n % i == 0) {
            return 0;
        }
        else if (i < Math.sqrt(n)) {
            return recurs7(n, i + 1);
        } else {
            return 1;
        }

    }
    public static void pr8() {
        System.out.println();
        System.out.println("Задание 8");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String str2 = new StringBuffer(str).reverse().toString();
        if (str.equals(str2)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
    public static void pr9() {
        System.out.println();
        System.out.println("Задание 9");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(recurs9(a, b));
    }
    public static int recurs9(int a, int b) {
        if (a > b + 1) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return recurs9(a, b - 1) + recurs9(a - 1, b - 1);
    }
    public static void pr10() {
        System.out.println();
        System.out.println("Задание 10");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(recurs10(n, 0));
    }
    public static int recurs10(int n, int i) {
        if (n==0) {
            return i;
        }
        else {
            return recurs10( n/10, i*10 + n%10 );
        }
    }
    public static void pr11() {
        System.out.println();
        System.out.println("Задание 11");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int count = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if ((str.charAt(i)!='0')&&(str.charAt(i+1)!='0')) {
                if (str.charAt(i)=='1') {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void pr12() {
        pr12_12();
    }
    public static void pr12_12() {
        System.out.println();
        System.out.println("Задание 12");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String answer="";
        for (int i = 0; i < str.length(); i++) {
            if((str.charAt(i)=='1')||(str.charAt(i)=='3')||(str.charAt(i)=='5')||(str.charAt(i)=='7')||(str.charAt(i)=='9')) {
                answer+=str.charAt(i);
            }
        }
        System.out.println(answer);
    }
    public static void pr13() {
        pr13_13();
    }
    public static void pr13_13() {
        System.out.println();
        System.out.println("Задание 13");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String answer="";
        for (int i = 0; i < str.length(); i++) {
            if((i%2!=0)&&(!((i==str.length()-1)&&(str.charAt(i)=='0')))) {
                answer+=str.charAt(i);
            }
        }
        System.out.println(answer);
    }
    public static void pr14() {
        System.out.println();
        System.out.println("Задание 14");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        recurs14(n);
    }
    public static int recurs14(int n) {
        if (n == 0) {
            return 0;
        }
        recurs14(n / 10);
        System.out.print(n%10+" ");
        return 0;
    }
    public static void pr15() {
        System.out.println();
        System.out.println("Задание 15");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        recurs15(n);
    }
    public static int recurs15(int n) {
        if (n == 0) {
            return 0;
        }
        System.out.print(n%10+" ");
        recurs15(n / 10);
        return 0;
    }
    public static void pr16() {
        int result = 0;
        System.out.println(pr16_16(result));
    }
    public static int pr16_16(int result) {
        System.out.println();
        System.out.println("Задание 16");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int n = Integer.parseInt(str);
        int n2=n;
        int max=0;
        int now_number=0;
        for (int i = 0; i < str.length(); i++) {
            now_number = n%10;
            if (now_number>max) {
                max = now_number;
            }
            n/=10;
        }
        for (int i = 0; i < str.length(); i++) {
            if (n2%10==max) {
                result++;
            }
            n2/=10;
        }
        return result;
    }
    public static void pr17() {
        int max = 0;
        System.out.println(pr17_17(max));
    }
    public static int pr17_17(int max) {
        System.out.println();
        System.out.println("Задание 17");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int n = Integer.parseInt(str);
        int n2=n;
        int now_number=0;
        for (int i = 0; i < str.length(); i++) {
            now_number = n%10;
            if (now_number>max) {
                max = now_number;
            }
            n/=10;
        }

        return max;
    }

}
