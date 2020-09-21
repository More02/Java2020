package ru.more02.ex7;

public abstract class Cups extends Dish {
    private int quantity;
    private int volume;

    public Cups(int quantity, int volume) {
        this.quantity = quantity;
        this.volume = volume;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Cups{" +
                "quantity=" + quantity +
                ", volume=" + volume +
                '}';
    }

}
