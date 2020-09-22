package ru.more02.ex9;

import ru.more02.ex8.Oval;

import java.awt.*;
import java.util.Random;

public class Line extends Oval {
    public void paint(Graphics g)
    {
        super.paint(g);
        int x1=0;
        int y1=0;
        int x2=0;
        int y2=0;
        int pos=0;
        Random rnd = new Random();
        Color[] colors = { Color.BLUE, Color.GREEN, Color.MAGENTA, Color.RED, Color.CYAN, Color.BLACK, Color.ORANGE, Color.YELLOW, Color.PINK };
        for (int i=0;i<6;i++) {
            x1 = rnd.nextInt(600);
            y1 = rnd.nextInt(600);
            x2 = rnd.nextInt(400);
            y2 = rnd.nextInt(300);
            pos = rnd.nextInt(colors.length);
            g.setColor(colors[pos]);
            g.drawLine(x1, y1, x2, y2);
        }
    }

    @Override
    public void dr() {

    }

    public Line() {
        super();
        setVisible(false);
    }
}
