package ru.more02.ex22;

import javax.xml.crypto.Data;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Student {
    private int id;
    private double average;
    private String fio;
    private String data;

    public Student(int id, double average, String fio, String data) {
        this.id = id;
        this.average = average;
        this.fio = fio;
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
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

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void DataToStr (String format) throws IOException, ParseException {
        String br = this.getData();
        SimpleDateFormat sdf = new SimpleDateFormat(format);
       // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Date date = sdf.parse(br);
        System.out.println(date);
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", average=" + average +
                ", fio='" + fio + '\'' +
                ", data='" + data + '\'' +
                '}';
    }

    public static void main(String[] args) throws IOException, ParseException {
        Scanner in = new Scanner(System.in);

        Student student = new Student(5, 4, "abc", "03.09.2000");
        System.out.println("Введите формат даты");
        String format = in.nextLine();
        student.DataToStr(format);

        Student student2 = new Student(5, 4, "abc", "2000-09-03");
        System.out.println("Введите формат даты");
        String format2 = in.nextLine();
        student2.DataToStr(format2);

        System.out.println("Введите данные в формате Год.месяц.число часы:минуты");
        String date_str3 = in.nextLine();
        String format3 = "yyyy.MM.dd HH:mm";
        SimpleDateFormat sdf = new SimpleDateFormat(format3);
        Date date = sdf.parse(date_str3);
        System.out.println(date);

        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, date.getHours());
        calendar.set(Calendar.MINUTE, date.getMinutes());
        calendar.set(Calendar.MONTH, date.getMonth());
        calendar.set(Calendar.DAY_OF_MONTH, date.getDate());
        System.out.println(calendar.getTime());

        System.out.println("Введите фамилию разработчика");
        String sername = in.nextLine();
        System.out.println(sername);
        Date date1 = sdf.parse("2020.10.10 16:00");
        System.out.println("Время получения задания: "+date1);
        Date date2 = new Date();
        System.out.println("Время сдачи задания: "+ date2);

    }
}
