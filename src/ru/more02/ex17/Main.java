package ru.more02.ex17;

import javax.sound.sampled.spi.AudioFileWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("newfile.txt", false)) {
            System.out.println("Введите информацию, которую необходимо добавить в файл");
            Scanner in = new Scanner(System.in);
            String str = in.nextLine();
            fileWriter.write(str);
            fileWriter.close();

        } catch (IOException e) {
            e.getMessage();
        }
        try (FileReader fileReader = new FileReader("newfile.txt")) {
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
        try (FileWriter fileWriter2 = new FileWriter("newfile.txt", false)) {
            System.out.println("Введите новую информацию, на которую необходимо заменить информацию в файле");
            Scanner in = new Scanner(System.in);
            String str = in.nextLine();
            fileWriter2.write(str);
            fileWriter2.close();

        } catch (IOException e) {
            e.getMessage();
        }
        try (FileReader fileReader2 = new FileReader("newfile.txt")) {
            System.out.println("Новая информация из файла");
            Scanner scan = new Scanner(fileReader2);
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        }
        try (FileWriter fileWriter3 = new FileWriter("newfile.txt", true)) {
            System.out.println("Введите информацию, которую необходимо добавить в конец файла");
            Scanner in = new Scanner(System.in);
            String str = in.nextLine();
            fileWriter3.write(str);
            fileWriter3.close();

        } catch (IOException e) {
            e.getMessage();
        }
        try (FileReader fileReader3 = new FileReader("newfile.txt")) {
            System.out.println("Иформация из файла");
            Scanner scan = new Scanner(fileReader3);
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
