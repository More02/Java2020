package ru.more02.ex24;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Person {
    private String name;
    private String surname;
    private String lastname;
    public Adres adres = new Adres();
    public Person(String name, String surname, String lastname) {
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
    public String getfio() {
        String fio=" ";
        if ((name!=null)&&(surname!=null)&&(lastname!=null)) {
            fio = fio + name + " " + surname + " "+lastname;
            System.out.println(fio);
            return fio;
        }
        else {
            System.out.println("Недостаточно данных");
            return "Недостаточно данных";
        }


    }
    public class Adres {
        private String country;
        private String region;
        private String city;
        private String street;
        private String house;
        private String structure;
        private String flat;
        public Adres() {

        }

    }

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        person1.setName("Иван");
        person1.setSurname("Иванов");
        person1.setLastname("Иванович");
        person1.getfio();
        System.out.println("Введите адрес1");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] str_arr = str.split(",");
        person1.adres.country=str_arr[0];
        person1.adres.region=str_arr[1];
        person1.adres.city=str_arr[2];
        person1.adres.street=str_arr[3];
        person1.adres.house=str_arr[4];
        person1.adres.structure=str_arr[5];
        person1.adres.flat=str_arr[6];
        for (int i = 0; i < str_arr.length; i++) {
            System.out.println(str_arr[i]);
        }

        System.out.println("Введите адрес2");
        String str2 = in.nextLine();
        String[] str_arr2 = str2.split(",");
        person2.adres.country=str_arr2[0];
        person2.adres.region=str_arr2[1];
        person2.adres.city=str_arr2[2];
        person2.adres.street=str_arr2[3];
        person2.adres.house=str_arr2[4];
        person2.adres.structure=str_arr2[5];
        person2.adres.flat=str_arr2[6];
        for (int i = 0; i < str_arr2.length; i++) {
            System.out.println(str_arr2[i]);
        }

        System.out.println("Введите адрес3");
        String str3 = in.nextLine();
        StringTokenizer st = new StringTokenizer(str3, ",.;");
        int j=0;
        while(st.hasMoreTokens()) {
            if (j==0) person3.adres.country=st.nextToken();
            if (j==1) person3.adres.region=st.nextToken();
            if (j==2) person3.adres.city=st.nextToken();
            if (j==3) person3.adres.street=st.nextToken();
            if (j==4) person3.adres.house=st.nextToken();
            if (j==5) person3.adres.structure=st.nextToken();
            if (j==6) person3.adres.flat=st.nextToken();
            j++;
        }


        System.out.println("Введите адрес4");
        String str4 = in.nextLine();
        StringTokenizer st4 = new StringTokenizer(str3, ",.;");
        int jj=0;
        while(st.hasMoreTokens()) {
            if (jj==0) person4.adres.country=st4.nextToken();
            if (jj==1) person4.adres.region=st4.nextToken();
            if (jj==2) person4.adres.city=st4.nextToken();
            if (jj==3) person4.adres.street=st4.nextToken();
            if (jj==4) person4.adres.house=st4.nextToken();
            if (jj==5) person4.adres.structure=st4.nextToken();
            if (jj==6) person4.adres.flat=st4.nextToken();
            jj++;
        }




    }
}
