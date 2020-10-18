package ru.more02.ex29;

import java.util.HashMap;
import java.util.NoSuchElementException;

public class RestaurantOrder<Item> implements Order {

    private InternetOrder<Item> front;
    private int size;
    public RestaurantOrder() {
        front = null;
    }
    public void addFront(Item x) {
        if (isEmpty())
            front = new InternetOrder<Item>(x);
        else {
            InternetOrder<Item> temp = front;
            front = new InternetOrder<Item>(null, x, temp);
            front.next.prev = front;
        }
        size++;
    }
    public void addEnd(Item x) {
        if (isEmpty())
            front = new InternetOrder<Item>(x);
        else {
            InternetOrder<Item> temp = front;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new InternetOrder<Item>(temp, x, null);
        }
        size++;
    }
    public void addBefore(Item x, Item y) {
        if (isEmpty())
            throw new NoSuchElementException("Element " + x.toString() + " not found");
        InternetOrder<Item> current = front;
        while (current != null && !current.data.equals(x))
            current = current.next;
        if (current == null)
            throw new NoSuchElementException("Element " + x.toString() + " not found");

        InternetOrder<Item> newNode = new InternetOrder<Item>(current.prev, y, current);
        if (current.prev != null)
            current.prev.next = newNode;
        else
            front = newNode;
        current.prev = newNode;

        size++;
    }

    public void addAfter(Item x, Item y) {
        if (isEmpty())
            throw new NoSuchElementException("Element " + x.toString() + " not found");

        InternetOrder<Item> current = front;

        while (current != null && !current.data.equals(x))
            current = current.next;

        if (current == null)
            throw new NoSuchElementException("Element " + x.toString() + " not found");

        InternetOrder<Item> newNode = new InternetOrder<Item>(current, y, current.next);
        if (current.next != null)
            current.next.prev = newNode;
        current.next = newNode;

        size++;
    }
    public void remove(Item x) {
        if (isEmpty())
            throw new NoSuchElementException("Element " + x.toString() + " not found");
        if (front.data.equals(x)) {
            front = front.next;
            return;
        }

        InternetOrder<Item> current = front;
        while (current != null && !current.data.equals(x))
            current = current.next;
        if (current == null)
            throw new NoSuchElementException("Element " + x.toString() + " not found");
        if (current.next != null)
            current.next.prev = current.prev;

        current.prev.next = current.next;

        size--;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean addFront(ru.more02.ex29.Item x) {
        return false;
    }

    @Override
    public boolean addFront(ru.more02.ex29.Item x, HashMap<String, Order> hashMap) {
        return false;
    }

    @Override
    public boolean addFront(HashMap<String, Order> hashMap) {
        return false;
    }

    @Override
    public int remove(ru.more02.ex29.Item x) {
        return 0;
    }

    @Override
    public int remove(ru.more02.ex29.Item x, HashMap<String, Order> hashMap) {
        return 0;
    }

    public int size() {
        return size;
    }

    @Override
    public ru.more02.ex29.Item getOrders(HashMap<String, Order> hashMap) {
        return null;
    }

    @Override
    public ru.more02.ex29.Item massOrders() {
        return null;
    }

    @Override
    public ru.more02.ex29.Item massOrderssorted() {
        return null;
    }

    @Override
    public int cost() {
        return 0;
    }

    @Override
    public int quantityporshions(String name) {
        return 0;
    }

    @Override
    public int quantity(ru.more02.ex29.Item x) {
        return 0;
    }

    @Override
    public ru.more02.ex29.Item massOrdersnames() {
        return null;
    }

    @Override
    public String toString() {
        InternetOrder<Item> temp = front;
        StringBuilder builder = new StringBuilder("[");

        while (temp != null) {
            builder.append(temp.data).append(",");
            temp = temp.next;
        }
        builder.deleteCharAt(builder.length() - 1);
        builder.append("]");
        return builder.toString();
    }
}