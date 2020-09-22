package ru.more02.ex8;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Shape2 extends JFrame {
    public Shape2() {
        super("Test");
        JFrame.setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(900, 600);
        setVisible(true);
    }
    public void paint(Graphics g) {
        int w=getWidth();
        int h=getHeight();
        try{
            Image myimg=ImageIO.read(new File ("C:\\Users\\mbaka\\Downloads\\mya7.jpg"));
            g.drawImage(myimg, 40, 40, null);

        }
        catch(java.io.IOException ex){ }
    }
}
