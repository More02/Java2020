package ru.more02.ex7;

public abstract class Plates extends Dish{
    private int quantity;
    private String type;

    public Plates(int quantity, String type) {
        this.quantity = quantity;
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Plates{" +
                "quantity=" + quantity +
                ", type='" + type + '\'' +
                '}';
    }

}
