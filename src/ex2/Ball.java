package ex2;

public class Ball {
    private String type;
    private int weight;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "type='" + type + '\'' +
                ", weight=" + weight +
                '}';
    }
    public Ball(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }
}
