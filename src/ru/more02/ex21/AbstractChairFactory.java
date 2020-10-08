package ru.more02.ex21;

public interface AbstractChairFactory {
    public VictorianChair createVictorianChair();
    public MagicanChair createMagicanChair();
    public FunctionalChair createFunctionalChair();

}
