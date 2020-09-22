package ru.more02.ex8;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
public class Shape3 extends JFrame {

    public Shape3() {
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
            for (int i = 0; i < 30; i++) {
                Image myimg= ImageIO.read(new File("C:\\Users\\mbaka\\Downloads\\mya7.jpg"));
                g.drawImage(myimg, 40, 40, null);
                try {
                    Thread.sleep(1000);
                } catch(InterruptedException ex) {}
                Image myimg2= ImageIO.read(new File("C:\\Users\\mbaka\\Downloads\\mya77.jpg"));
                g.drawImage(myimg2, 40, 40, null);
                try {
                    Thread.sleep(1000);
                } catch(InterruptedException ex) {}
            }


        }
        catch(java.io.IOException ex){ }
    }
}
