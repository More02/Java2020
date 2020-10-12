package ru.more02.ex27.Calculator.Model;

import java.util.EmptyStackException;
import java.util.Stack;

public class Calculator {

    private Stack<Double> stack = new Stack<>();
    private String currentDisplay = "0";
    private boolean isDisplayEnter = false;


    public void doOperation(Operator o){
        if(!isDisplayEnter)
            enter();

        try {
            Double result = o.function(stack.pop(), stack.pop());
            currentDisplay = result.toString();
            isDisplayEnter = false;
            enter();
        }
        catch (EmptyStackException e){
            currentDisplay = "ERROR";
            isDisplayEnter = true;
        }

    }

    public void enter(){
        if(!isDisplayEnter)
            stack.push(new Double(currentDisplay));
        isDisplayEnter = true;
    }

    public void addDigit(String n){
        if(!isDisplayEnter && !currentDisplay.equals("0"))
            currentDisplay += n;
        else
            currentDisplay = n;

        isDisplayEnter = false;
    }

    public String getCurrentDisplay(){
        return currentDisplay;
    }
}