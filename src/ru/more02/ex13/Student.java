package ru.more02.ex13;

public class Student {
    private int id;
    private double average;

    public Student(int id, double average) {
        this.id = id;
        this.average = average;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", average=" + average +
                '}';
    }
}
