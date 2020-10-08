package ru.more02.ex19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Students {
    Student[] students = new Student[5];
    int[] IDNumber = new int[5];
    public Students() {
        students[0] = new Student (4, 3.23, "abc");
        students[1] = new Student (5, 4.23, "bcd");
        students[2] = new Student (3, 5, "rkf");
        students[3] = new Student (1, 4.5, "cde");
        students[4] = new Student (2, 4.6, "art");

    }
    public void SearchForFio(String fio) {
        int check=0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFio()==fio) {
                System.out.println(students[i].getId()+" "+students[i].getAverage()+" "+students[i].getFio());
                check = 1;
            }
        }
        if (check==0) {
            System.out.println("Не найдено");
        }
    }

    public void SortFio() {
        SortingStudentByFIO sortingStudentByFIO = new SortingStudentByFIO();
        ArrayList<Student> studentArrayList = new ArrayList<Student>();
        studentArrayList.addAll(Arrays.asList(students));
        Collections.sort(studentArrayList, sortingStudentByFIO);
        for (Student s : studentArrayList) {
            System.out.print(s.getFio()+" ");
        }
    }
    public void sortIDNumber() {
        for (int i=0;i<5;i++) {
            IDNumber[i] = students[i].getId();
        }

        for (int i = 0; i < IDNumber.length - 1; i++) {
            for (int j = IDNumber.length - 1; j > i; j--) {
                if (IDNumber[j - 1] > IDNumber[j]) {
                    double tmp = IDNumber[j - 1];
                    IDNumber[j - 1] = IDNumber[j];
                    IDNumber[j] = (int) tmp;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(IDNumber[i]+" ");
        }
    }


    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int[] getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(int[] IDNumber) {
        this.IDNumber = IDNumber;
    }


    public static void main(String[] args) {
        Students studentss = new Students();
        studentss.sortIDNumber();
        System.out.println();
        System.out.println("Введите фамилию для поиска");
        Scanner in = new Scanner(System.in);
        String fio;
        fio=in.nextLine();
        studentss.SearchForFio("abc");
        studentss.SortFio();
    }
}
