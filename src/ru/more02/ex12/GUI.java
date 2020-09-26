package ru.more02.ex12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame{
    public GUI() {
        JFrame frame = new JFrame("example");
        Label label1 = new Label("Выберите планету");
        label1.setBounds(30, 10, 320, 20);
        label1.setFont(new Font("Times New Roman", Font.ITALIC, 15));
        frame.add(label1);

        JComboBox faceCombo = new JComboBox();
        faceCombo.setEditable(true);
        faceCombo.addItem("Меркурий");
        faceCombo.addItem("Венера");
        faceCombo.addItem("Земля");
        faceCombo.addItem("Марс");
        faceCombo.addItem("Юпитер");
        faceCombo.addItem("Сатурн");
        faceCombo.addItem("Уран");
        faceCombo.addItem("Нептун");

        faceCombo.setBounds(30, 40, 320, 40);
        frame.add(faceCombo);

        Label label3 = new Label("Притяжение выбранной планеты:");
        label3.setBounds(30, 120, 320, 40);
        label3.setFont(new Font("Times New Roman", Font.ITALIC, 15));
        frame.add(label3);

        Label label2 = new Label("3,7Н/кг");
        label2.setBounds(30, 170, 320, 40);
        label2.setFont(new Font("Times New Roman", Font.ITALIC, 15));
        frame.add(label2);

        faceCombo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (faceCombo.getSelectedIndex()==0) {
                    label2.setText("3,7Н/кг");
                }
                else if (faceCombo.getSelectedIndex()==1) {
                    label2.setText("8,9Н/кг");
                }
                else if (faceCombo.getSelectedIndex()==2) {
                    label2.setText("9,8Н/кг");
                }
                else if (faceCombo.getSelectedIndex()==3) {
                    label2.setText("3,7Н/кг");
                }
                else if (faceCombo.getSelectedIndex()==4) {
                    label2.setText("24,7Н/кг");
                }
                else if (faceCombo.getSelectedIndex()==5) {
                    label2.setText("9Н/кг");
                }
                else if (faceCombo.getSelectedIndex()==6) {
                    label2.setText("8,7Н/кг");
                }
                else if (faceCombo.getSelectedIndex()==7) {
                    label2.setText("11Н/кг");
                }

            }
        });


        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

}
