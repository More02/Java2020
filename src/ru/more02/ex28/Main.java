package ru.more02.ex28;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        String item_Code="";
        int item_price;
        System.out.println("Введите 1, если хотите ввести информацию о товаре");
        System.out.println("Введите 2, если хотите выбрать метод оплаты");
        System.out.println("Введите 0, если хотите завершить выполнение программы");

        int n=10;
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        while (n!=0) {
            switch (n) {
                case 1:
                    System.out.println("Введите данные о товаре в формате 'код или название товара' 'цена'");
                    item_Code = in.next();
                    item_price = in.nextInt();
                    Item item1 = new Item(item_Code,item_price);
                    cart.addItem(item1);
                    break;
                case 2:
                    System.out.println("Введите 1, если хотите оплатить через Paypal");
                    System.out.println("Введите 2, если хотите оплатить кредитной картой");
                    int type_payment = in.nextInt();
                    if (type_payment==1) {
                        System.out.println("Введите email адрес");
                        String email_adres = in.next();
                        System.out.println("Введите пароль");
                        String password = in.next();
                        cart.pay(new PaypalStrategy(email_adres, password));
                    }
                    else if (type_payment==2) {
                        System.out.println("Введите Имя Фамилию");
                        String name = in.nextLine();
                        name = in.nextLine();
                        Scanner in2 = new Scanner(System.in);
                        System.out.println("Введите номер карты");
                        String card_number = in2.next();
                        System.out.println("Введите cvv");
                        String cvv = in2.next();
                        System.out.println("Введите срок действия");
                        String date = in2.next();
                        cart.pay(new CreditCardStrategy(name, card_number, cvv, date));

                    }
                case 0:
                    System.exit(0);

            }
            System.out.println("Введите 1, если хотите ввести информацию о товаре");
            System.out.println("Введите 2, если хотите выбрать метод оплаты");
            System.out.println("Введите 0, если хотите завершить выполнение программы");
            n=in.nextInt();
        }

    }
}
