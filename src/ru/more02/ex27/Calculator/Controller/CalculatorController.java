package ru.more02.ex27.Calculator.Controller;

import ru.more02.ex27.Calculator.Model.Calculator;
import ru.more02.ex27.Calculator.View.CalculatorView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController implements ActionListener {

    private Calculator cal;
    private CalculatorView view;

    public CalculatorController(Calculator cal, CalculatorView view){
        this.cal = cal;
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton butt = (JButton) e.getSource();
        String buttTxt = butt.getText();

        if(buttTxt.equals("+"))
            cal.doOperation((a, b) -> a+b);
        else if(buttTxt.equals("-"))
            cal.doOperation((a, b) -> b-a);
        else if(buttTxt.equals("X"))
            cal.doOperation((a, b) -> a*b);
        else if(buttTxt.equals("/"))
            cal.doOperation((a, b) -> b/a);
        else if(buttTxt.equals("Enter"))
            cal.enter();
        else
            cal.addDigit(buttTxt);

        view.getScreen().setText(cal.getCurrentDisplay());
    }
}
