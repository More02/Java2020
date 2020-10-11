package ru.more02.ex24;

import java.util.StringTokenizer;

public class Shirt {
    public String sn;
    public String name;
    public String color;
    public String size;

    @Override
    public String toString() {
        return "Shirt{" +
                "sn='" + sn + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    public static void main(String[] args) {
        String[] shirts = new String[11];
        Shirt[] shirts1 = new Shirt[11];
        for (int i = 0; i < 11; i++) {
            shirts1[i] = new Shirt();
        }
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
        for (int i = 0; i < 11; i++) {
            String[] str_arr2 = shirts[i].split(",");
            shirts1[i].sn = str_arr2[0];
            shirts1[i].name = str_arr2[1];
            shirts1[i].color = str_arr2[2];
            shirts1[i].size = str_arr2[3];
        }
        for (int i = 0; i < 11; i++) {
            System.out.println(shirts1[i].sn+" "+shirts1[i].name+" "+shirts1[i].color+" "+shirts1[i].size);
        }
    }


}
