package ru.more02.ex30;

public final class Customer {
    private String firstName;
    private String secondName;
    private int age;
    private Adress adress;
    private Customer MATURE_UNKNOWN_CUSTOMER;
    private Customer NOT_MATURE_UNKNOWN_CUSTOMER;

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public Adress getAdress() {
        return adress;
    }
}
