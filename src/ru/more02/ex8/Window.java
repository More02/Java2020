package ru.more02.ex8;

import javax.swing.*;

public abstract class Window extends JFrame {
    public Window() {
        super("Test");
        JFrame.setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(800, 600);
        setVisible(true);
    }
    public abstract void dr();

}
