package ru.more02.ex27.Calculator.View;

import javax.swing.*;
import java.awt.*;

public class CalculatorView extends JFrame {

    private Screen screen = new Screen();
    private Keyboard keyboard = new Keyboard();

    public CalculatorView(){
        JPanel container  = new JPanel();

        this.setTitle("Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 465);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());

        container.add(screen, BorderLayout.NORTH);
        container.add(keyboard, BorderLayout.CENTER);
        container.setBackground(Color.LIGHT_GRAY);

        this.setContentPane(container);
        this.setVisible(true);
    }


    public ru.more02.ex27.Calculator.View.Screen getScreen() { return screen; }
    public ru.more02.ex27.Calculator.View.Keyboard getKeyboard() { return keyboard; }
}