package ru.more02.ex7;

public abstract class Table extends Furniture{
    private String type;
    private String color;

    public Table(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Table{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
