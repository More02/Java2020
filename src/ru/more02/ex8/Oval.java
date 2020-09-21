package ru.more02.ex8;

import java.awt.*;

public abstract class Oval extends Rectangle {
    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.red);
        g.fillRect(100, 200, 100, 200);
    }
    public Oval() {
        super();
        setVisible(false);
    }
}
