package ru.more02.ex7;

public abstract class Labrodor extends Dog{
    private String gender;
    private int weight;

    public Labrodor(String gender, int weight) {
        this.gender = gender;
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Labrodor{" +
                "gender='" + gender + '\'' +
                ", weight=" + weight +
                '}';
    }
}
