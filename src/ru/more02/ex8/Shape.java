package ru.more02.ex8;

import javax.swing.*;
import java.awt.*;

public abstract class Shape extends JFrame {
    public abstract void dr();

    public Shape() {
        super("Test");
        JFrame.setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(800, 800);
        setVisible(false);
    }
}
