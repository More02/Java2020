package ru.more02.ex27.Calculator;

import ru.more02.ex27.Calculator.Controller.CalculatorController;
import ru.more02.ex27.Calculator.Model.Calculator;
import ru.more02.ex27.Calculator.View.CalculatorView;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        CalculatorView view = new CalculatorView();
        Calculator calculator = new Calculator();
        CalculatorController control = new CalculatorController(calculator, view);

        for(JButton b: view.getKeyboard().getButtons())
            b.addActionListener(control);
    }
}