package ru.more02.ex7;

public abstract class Dolmatian extends Dog {
    private int quantity;
    private int weight;

    public Dolmatian(int quantity, int weight) {
        this.quantity = quantity;
        this.weight = weight;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dolmatian{" +
                "quantity=" + quantity +
                ", weight=" + weight +
                '}';
    }
}
