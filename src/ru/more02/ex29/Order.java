package ru.more02.ex29;

import java.util.HashMap;

public interface Order {
    public boolean addFront(Item x);
    public boolean addFront(Item x, HashMap<String, Order> hashMap);
    public boolean addFront(HashMap<String, Order> hashMap);
    public int remove(Item x);
    public int remove(Item x, HashMap<String, Order> hashMap);
    public int size();
    public Item getOrders(HashMap<String, Order> hashMap);
    public Item massOrders();
    public Item massOrderssorted();
    public int cost();
    public int quantityporshions(String name);
    public int quantity(Item x);
    public Item massOrdersnames();

}
