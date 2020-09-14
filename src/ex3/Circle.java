package ex3;

public class Circle {
    private int radius;
    private double length;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", length=" + length +
                '}';
    }

    public Circle(int radius, double length) {
        this.radius = radius;
        this.length = length;
    }
}
