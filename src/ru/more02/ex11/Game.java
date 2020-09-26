package ru.more02.ex11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Game extends JFrame {
    public int number;
    public int quantity_iterations=0;
    public int result=0;
    public Game() {
        super();
        Random rnd = new Random();
        number = rnd.nextInt(20);
        JFrame frame = new JFrame("example");
        JButton button = new JButton("Проверить значение");
        JButton button_exit = new JButton("Выйти");
        JTextField bigField = new JTextField("Текст поля", 25);
        bigField.setFont(new Font("Dialog", Font.PLAIN, 20));
        bigField.setHorizontalAlignment(JTextField.CENTER);
        bigField.setBackground(Color.WHITE);
        bigField.setBounds(30, 100, 320, 40);
        button.setBounds(30,160,320,40);
        button_exit.setBounds(30,260,320,40);
        button_exit.setVisible(false);
        frame.add(button);
        frame.add(bigField);
        frame.add(button_exit);
        JTextField text2 = new JTextField("Результат угадывания", 20);
        frame.add(text2);
        text2.setFont(new Font("Dialog", Font.PLAIN, 20));
        text2.setHorizontalAlignment(JTextField.CENTER);
        text2.setBackground(Color.WHITE);
        text2.setBounds(30, 230, 320, 30);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int input = Integer.parseInt(bigField.getText());
                    if (input>number) {
                        text2.setText("Число больше необходимого");
                    }
                    else if (input<number) {
                        text2.setText("Число меньше необходимого");
                    }
                    else if (input==number){
                        text2.setText("Вы победили");
                        result=1;
                        button_exit.setVisible(true);
                        button.setVisible(false);
                    }
                    quantity_iterations++;
                    if ((quantity_iterations==3)&&(result!=1)) {
                        text2.setText("Вы проиграли");
                        button_exit.setVisible(true);
                        button.setVisible(false);
                    }
            }
        };
        ActionListener actionListener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // dispose();
                System.exit(0);
            }
        };
        button.addActionListener(actionListener);
        button_exit.addActionListener(actionListener2);
    }

}
