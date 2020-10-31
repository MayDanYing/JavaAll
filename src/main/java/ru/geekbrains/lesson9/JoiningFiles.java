package ru.geekbrains.lesson9;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Напишите метод, который последовательно сшивает все текстовые файлы
// в указанном каталоге в один файл (подкаталоги обходить не нужно).

public class JoiningFiles {

    public static void main(String[] args) throws IOException {

        File directory = new File("C:/Users/admin/Documents/java/join");
        File[] files = directory.listFiles();
        Scanner scanner;
        FileWriter writer = new FileWriter("C:/Users/admin/Documents/java/join/Chapter01-02.txt");
        if (files != null) {
            for(File file : files) {
                scanner = new Scanner(file);
                String input;
                while (scanner.hasNextLine()) {
                    input = scanner.nextLine();
                    writer.append(input).append("\n");
                }
                writer.flush();
            }
        }
        System.out.println("Chapter01 and Chapter02 were merged into one file - Chapter01-02.txt");
    }
}
