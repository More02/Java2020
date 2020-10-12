package ru.more02.ex27.Calculator.Model;

@FunctionalInterface
public interface Operator {

    Double function(Double a, Double b);
}