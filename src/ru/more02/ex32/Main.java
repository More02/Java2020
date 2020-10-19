package ru.more02.ex32;
import ru.more02.ex30.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите цену, название и описание");
        Scanner in = new Scanner(System.in);
        int quantity = in.nextInt();
        String name = in.next();
        String description = in.next();
        MenuItem menuItem = new MenuItem(quantity, name, description);
        try (FileWriter fileWriter = new FileWriter("newfile4.txt", false)) {
            fileWriter.write(menuItem.toString());
        } catch (IOException e) {
            e.getMessage();
        }
        try (FileReader fileReader = new FileReader("newfile4.txt")) {
            System.out.println("Информация из файла");
            Scanner scan = new Scanner(fileReader);
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
