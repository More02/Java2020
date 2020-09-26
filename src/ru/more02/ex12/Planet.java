package ru.more02.ex12;

public enum Planet {
    Mercury(23, 34532),
    Venus (1254, 123432),
    Earth(123, 56787),
    Mars (7, 23232),
    Jupiter (9, 48594),
    Saturn (89, 98564),
    Uranus (213, 23232323),
    Neptune (23, 897);
    public int radius;
    public int mass;

    Planet(int radius, int mass) {
        this.radius = radius;
        this.mass = mass;
    }
}
