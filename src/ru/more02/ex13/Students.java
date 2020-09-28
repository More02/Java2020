package ru.more02.ex13;

public class Students {
    Student[] students = new Student[5];
    int[] IDNumber = new int[5];
    public Students() {
        students[0] = new Student (4, 3.23);
        students[1] = new Student (5, 4.23);
        students[2] = new Student (3, 5);
        students[3] = new Student (1, 4.5);
        students[4] = new Student (2, 4.6);

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
    }
 }
