package ru.more02.ex9;

import ru.more02.ex8.Oval;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Shape9 extends Line {
    @Override
    public void dr() {

    }

    public Shape9() {
        super();
        JFrame my = new JFrame("Figures");
        my.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button = new JButton("Test button");
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(true);
            }
        };
        button.addActionListener(actionListener);
        my.add(button);
        my.pack();
        my.setVisible(true);
        my.setSize(500,200);
        button.setBackground(Color.red);
        button.setText("Draw 20 figures");
        button.setSize(500, 600);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }

}
