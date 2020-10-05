package ru.more02.ex20;

import java.io.File;
import java.util.ArrayList;

public class Files {


    public static void readFiles(File baseDirectory){
        ArrayList<File> list = new ArrayList<File>();
        if (baseDirectory.isDirectory()){
            for (File file : baseDirectory.listFiles()) {
                list.add(file);
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i).getName());
        }
    }

    public static void main(String[] args) {
        File dir = new File("C:\\Users\\Saint\\Desktop");
        readFiles(dir);


    }
}
