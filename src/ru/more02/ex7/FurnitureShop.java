package ru.more02.ex7;

import java.util.Arrays;

public abstract class FurnitureShop extends Furniture{
    public Chair[] chairs;
    public Table[] tables;

    public FurnitureShop(Chair[] chairs, Table[] tables) {
        this.chairs = chairs;
        this.tables = tables;
    }

    public Chair[] getChairs() {
        return chairs;
    }

    public void setChairs(Chair[] chairs) {
        this.chairs = chairs;
    }

    public Table[] getTables() {
        return tables;
    }

    public void setTables(Table[] tables) {
        this.tables = tables;
    }

    @Override
    public String toString() {
        return "FurnitureShop{" +
                "chairs=" + Arrays.toString(chairs) +
                ", tables=" + Arrays.toString(tables) +
                '}';
    }
}
