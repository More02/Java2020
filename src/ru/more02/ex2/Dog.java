package ru.more02.ex2;

public class Dog {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int VoidToHuman(int age) {
        int human_age=age*7;
        return human_age;

    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
