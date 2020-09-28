package ru.more02.ex13;

public class Students {
    Student[] students = new Student[5];
    int[] IDNumber = new int[5];
    public Students() {
        students[0].setId(5);
        students[1].setId(3);
        students[2].setId(2);
        students[3].setId(4);
        students[4].setId(1);

    }
    public void sortIDNumber() {
        for (int i=0;i<5;i++) {
            IDNumber[i] = students[i].getId();
        }
        for (int i = 1; i < 5; i++) {
            if (IDNumber[i] < IDNumber[i - 1]) {
                int tmp = IDNumber[i];
                IDNumber[i] = IDNumber[i-1];
                IDNumber[i-1] = tmp;

            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(IDNumber[i]+" ");
        }
    }

    public static void main(String[] args) {
        Students studentss = new Students();
        studentss.sortIDNumber();
    }
 }
