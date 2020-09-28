package ru.more02.ex15;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);

        for (int s: arrayList) {
            System.out.print(s+" ");
        }
        System.out.println();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("first");
        linkedList.add("second");
        linkedList.add("third");
        linkedList.add("fourth");
        linkedList.add("fifth");

        for (String ss: linkedList) {
            System.out.print(ss+" ");
        }
        MyArrayList<Integer> myArrayList = new  MyArrayList<Integer>();
        myArrayList.add(4);
        myArrayList.add(5);
        myArrayList.add(6);
        myArrayList.add(7);
        myArrayList.add(8);

        for (int i=0;i<myArrayList.size();i++) {
            System.out.println(myArrayList.get(i));
        }


    }
}
