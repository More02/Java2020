package ru.more02.ex29;

public class InternetOrder<Item> {

    Item data;
    InternetOrder<Item> next;
    InternetOrder<Item> prev;

    InternetOrder(Item data) {
        this(null, data, null);
    }

    InternetOrder(InternetOrder<Item> prev, Item data, InternetOrder<Item> next) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}