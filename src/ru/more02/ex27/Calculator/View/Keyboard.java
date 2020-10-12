package ru.more02.ex27.Calculator.View;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class Keyboard extends JPanel {

    private List<JButton> buttons = new LinkedList<>();

    public Keyboard(){
        String[] buttonMainStr = {"7", "8", "9", "/", "4", "5", "6", "X","1", "2", "3", "-", "0", ".", "Enter", "+"};

        Font ftIco = new Font("Sans-Sarif", Font.PLAIN, 24);
        Font ftText = new Font("Sans-Sarif", Font.PLAIN, 20);
        this.setPreferredSize(new Dimension(405, 350));
        this.setOpaque(false);
        this.setLayout(new GridLayout(4, 4, 5, 5));

        for(String str: buttonMainStr){
            JButton but = new JButton(str);
            but.setFont(str.length() == 1? ftIco: ftText);
            this.add(but);
            buttons.add(but);
        }
    }


    public List<JButton> getButtons() {
        return buttons;
    }
}