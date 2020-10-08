package ru.more02.ex21;

public abstract class ChairFactory implements AbstractChairFactory {
    public abstract VictorianChair createVictorianChair();
    public abstract MagicanChair createMagicanChair();
    public abstract FunctionalChair createFunctionalChair();
}
