package ru.more02.ex11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame {
    public Game() {
        super();
        JFrame frame = new JFrame("example");
        JButton button = new JButton("Проверить значение");
        JTextField bigField = new JTextField("Текст поля", 25);
        bigField.setFont(new Font("Dialog", Font.PLAIN, 20));
        bigField.setHorizontalAlignment(JTextField.CENTER);
        bigField.setBackground(Color.WHITE);
        bigField.setBounds(50, 100, 200, 40);
        button.setBounds(50,160,200,40);
        frame.add(button);
        frame.add(bigField);
        JTextField text2 = new JTextField("Введённый результат", 20);
        frame.add(text2);
        text2.setFont(new Font("Dialog", Font.PLAIN, 20));
        text2.setHorizontalAlignment(JTextField.CENTER);
        text2.setBackground(Color.WHITE);
        text2.setBounds(50, 230, 200, 30);
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // bigField.getText();

                text2.setText(bigField.getText());
//                Label lbl = new Label();
//                lbl.setBackground(Color.black);
//                lbl.setBounds(50, 210, 200, 40);
//                lbl.setText(bigField.getText());
            }
        };
        button.addActionListener(actionListener);
//        JFrame my = new JFrame("Game");
//        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//        my.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        JFrame.setDefaultLookAndFeelDecorated(true);
//        my.setSize(1000,1000);
//        my.setLocationRelativeTo(null);
//        my.setLayout(null);
//        JButton jbutton = new JButton("Test button");
//        ActionListener actionListener = new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                //setVisible(true);
//            }
//        };
//        jbutton.addActionListener(actionListener);
//        JTextField bigField = new JTextField("Текст поля", 25);
//        bigField.setFont(new Font("Dialog", Font.PLAIN, 30));
//        bigField.setHorizontalAlignment(JTextField.CENTER);
//        bigField.setBackground(Color.PINK);
//        my.setLayout(new FlowLayout());
//        jbutton.setBounds(100, 100, 400, 400);
//       // button.setSize(500, 400);
//       // bigField.setSize(500, 300);
//        my.add(jbutton);
//        my.add(bigField);
//        my.pack();
//        my.setVisible(true);
//
//        jbutton.setBackground(Color.red);
//        jbutton.setText("Проверить ответ");
//
//
//        bigField.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                bigField.getText();
//            }
//        });
    }

}
