package ru.more02.ex21;

public abstract class ConcreteFactory implements ComplexAbstractFactory{
    public abstract Complex createComplex();
    public abstract Complex CreateComplex(int real, int image);
}
