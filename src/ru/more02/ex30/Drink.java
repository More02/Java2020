package ru.more02.ex30;

public class Drink extends MenuItem implements Alchoholable {
    private double alcoholVol;
    private DrinkTypeEnum type;

    public DrinkTypeEnum getType() {
        return type;
    }

    @Override
    public boolean isAlcoholicDrink() {
        return false;
    }

    @Override
    public double getAlcoholVol() {
        return 0;
    }
}
