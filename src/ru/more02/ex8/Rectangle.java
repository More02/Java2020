package ru.more02.ex8;

import java.awt.*;

public abstract class Rectangle extends Shape {
    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.blue);
        g.fillRect(0, 0, 100, 200);
    }
    public Rectangle(){
        super();
        setVisible(false);
    }

}
