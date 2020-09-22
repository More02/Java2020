package ru.more02.ex8;

import java.awt.*;

public abstract class Oval extends Rectangle {
    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.red);
        g.drawOval(100, 200, 400, 300);
    }
    public Oval() {
        super();
        setVisible(true);
    }
}
