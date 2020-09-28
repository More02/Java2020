package ru.more02.ex13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class SortingStudentByGPA implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAverage()>o2.getAverage() ? 1 : (o1.getAverage()<o2.getAverage()) ? -1 : 0;
    }

    public static void main(String[] args) {
        ArrayList<Student> studentssss = new ArrayList<Student>();
        studentssss.add(new Student(3, 3.5));
        studentssss.add(new Student(2, 5));
        studentssss.add(new Student(1, 4.5));
        studentssss.add(new Student(4, 4.5));
        studentssss.add(new Student(0, 4.6));

        ArrayList<Student> studentssss2 = new ArrayList<Student>();
        studentssss.add(new Student(6, 3.35));
        studentssss.add(new Student(7, 5));
        studentssss.add(new Student(8, 4.45));
        studentssss.add(new Student(9, 4.75));
        studentssss.add(new Student(5, 4.26));


        studentssss.addAll(studentssss2);

        Collections.sort(studentssss, new SortingStudentByGPA());

        for (Student s : studentssss) {
            System.out.print(s.getAverage()+" ");
        }
    }

}
