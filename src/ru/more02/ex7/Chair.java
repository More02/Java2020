package ru.more02.ex7;

public abstract class Chair extends Furniture{
    private String type;
    private int quantity;

    public Chair(String type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "type='" + type + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
