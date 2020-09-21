package ru.more02.ex7;

public class Main {
    public static void main (String[] args) {
        Cups cup = new Cups(4, 5) {
            @Override
            public void Wash() {

            }
        };
        Plates plate = new Plates(4, "deep") {
            @Override
            public void Wash() {

            }
        };

        System.out.println(cup.toString());
        System.out.println(plate.toString());

        Labrodor labrodor = new Labrodor("men", 10) {
            @Override
            public void Walk() {

            }
        };
        Dolmatian dolmatian = new Dolmatian(4, 12) {
            @Override
            public void Walk() {

            }
        };
        System.out.println(labrodor.toString());
        System.out.println(dolmatian.toString());

        Chair chair = new Chair("big", 2) {
            @Override
            public void built() {

            }
        };
        Chair chair2 = new Chair("small", 3) {
            @Override
            public void built() {

            }
        };
        Table table = new Table("school", "white") {
            @Override
            public void built() {

            }
        };
        Table table2 = new Table("office", "black") {
            @Override
            public void built() {

            }
        };
        System.out.println(table.toString());
        System.out.println(chair.toString());

        Table[] tables = new Table[2];
        Chair[] chairs = new Chair[2];
        tables[0] = table;
        tables[1]=table2;
        chairs[0] = chair;
        chairs[1] = chair2;
        FurnitureShop furnitureShop = new FurnitureShop(chairs, tables) {
            @Override
            public void built() {

            }
        };
        System.out.println(furnitureShop.toString());
    }
}
