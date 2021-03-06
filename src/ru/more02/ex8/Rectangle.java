package ru.more02.ex8;

import java.awt.*;
import java.util.Random;

public abstract class Rectangle extends Shape {
    public void paint(Graphics g)
    {
        super.paint(g);
        int x1=0;
        int y1=0;
        int width=0;
        int length=0;
        int pos=0;
        Random rnd = new Random();
        Color[] colors = { Color.BLUE, Color.GREEN, Color.MAGENTA, Color.RED, Color.CYAN, Color.BLACK, Color.ORANGE, Color.YELLOW, Color.PINK };
        for (int i=0;i<7;i++) {
            x1 = rnd.nextInt(600);
            y1 = rnd.nextInt(600);
            width = rnd.nextInt(300);
            length = rnd.nextInt(400);
            pos = rnd.nextInt(colors.length);
            g.setColor(colors[pos]);
            g.fillRect(x1, y1, width, length);
        }

    }
    public Rectangle(){
        super();
        setVisible(false);
    }

}
