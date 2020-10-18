package ru.more02.ex29;

import java.util.HashMap;
import java.util.NoSuchElementException;

public class OrderManager<Item> {
    private InternetOrder<Item> front;
    private int size;
    HashMap<String, Order> hashtable = new HashMap<String, Order>();

    public OrderManager() {
        front = null;
    }
    public boolean addFront(HashMap<String, Order> hashtable) {
        if (isEmpty()) {
            front = new InternetOrder<Item>((Item) hashtable.values());
            size++;
            return false;
        }

        else {
            InternetOrder<Item> temp = front;
            front = new InternetOrder<Item>(null, (Item) hashtable.values(), temp);
            front.next.prev = front;
            size++;
            return true;
        }

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
