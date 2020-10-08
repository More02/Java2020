package ru.more02.ex21;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public abstract class CreateTextDocument {
    public CreateTextDocument() {
        try (FileWriter fileWriter = new FileWriter("newfile.txt", false)) {
            String str = "Информация, добавленная в текстовый документ";
            fileWriter.write(str);

        } catch (IOException e) {
            e.getMessage();
        }

    }
}
