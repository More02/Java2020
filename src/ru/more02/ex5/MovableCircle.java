package ru.more02.ex5;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;
    public void moveUp() {}
    public void moveDown(){}
    public void moveLeft(){}
    public void moveRight(){}


    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    public MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed) {
        this.radius = radius;
        center.x = x;
        center.y = y;
        center.xSpeed = xSpeed;
        center.ySpeed = ySpeed;
    }
}
