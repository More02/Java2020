package ru.more02.ex11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zones extends JFrame {
    public Zones() {
        JFrame frame = new JFrame("example");
        JButton button = new JButton("Center");
        button.setBounds(300,300,200,200);
        button.setBackground(Color.red);
        JButton button2 = new JButton("North");
        button2.setBounds(150,100,500,200);
        button2.setBackground(Color.blue);
        JButton button3 = new JButton("South");
        button3.setBounds(150,500,500,200);
        button3.setBackground(Color.CYAN);
        JButton button4 = new JButton("East");
        button4.setBounds(150,300,150,200);
        button4.setBackground(Color.YELLOW);
        JButton button5 = new JButton("West");
        button5.setBounds(500,300,150,200);
        button5.setBackground(Color.ORANGE);
        frame.add(button);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.setSize(800,800);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(frame, "Добро пожаловать в ЦАО", "Оповещение", JOptionPane.DEFAULT_OPTION);
            }
        };
        ActionListener actionListener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(frame, "Добро пожаловать в САО", "Оповещение", JOptionPane.DEFAULT_OPTION);
            }
        };
        ActionListener actionListener3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(frame, "Добро пожаловать в ЮЗАО", "Оповещение", JOptionPane.DEFAULT_OPTION);
            }
        };
        ActionListener actionListener4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(frame, "Добро пожаловать в СВАО", "Оповещение", JOptionPane.DEFAULT_OPTION);
            }
        };
        ActionListener actionListener5 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(frame, "Добро пожаловать в ЗАО", "Оповещение", JOptionPane.DEFAULT_OPTION);
            }
        };
        button.addActionListener(actionListener);
        button2.addActionListener(actionListener2);
        button3.addActionListener(actionListener3);
        button4.addActionListener(actionListener4);
        button5.addActionListener(actionListener5);
    }
}