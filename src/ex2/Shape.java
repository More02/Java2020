package ex2;

public class Shape {
    private String color;
    private int sidesCount;


    public Shape(String color, int sidesCount) {
        this.color = color;
        this.sidesCount = sidesCount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSidesCount() {
        return sidesCount;
    }

    public void setSidesCount(int sidesCount) {
        this.sidesCount = sidesCount;
    }
    public void printShapeInfo() {
        System.out.println(color);
        System.out.println(sidesCount);
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", sidesCount=" + sidesCount +
                '}';
    }
}

