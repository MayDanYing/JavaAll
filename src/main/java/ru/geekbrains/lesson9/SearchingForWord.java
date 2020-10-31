package ru.geekbrains.lesson9;
import java.io.FileInputStream;
import java.io.IOException;

//Напишите метод, который подсчитывает сколько раз в текстовом файле встречается
// данная последовательность символов с учетом регистра.

public class SearchingForWord {
    public static void main(String[] args) {
        try {
            find("C:/Users/admin/Documents/java/Chapter01.txt","Baggins");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void find(String filename, String searchWord) throws IOException {
        FileInputStream file = new FileInputStream(filename);
        byte[] content = new byte[file.available()];
        file.read(content);
        String[] lines = new String(content).split("\n");
        int count = 0;
        for (String line : lines) {
            String[] words = line.split(" ");
             for (String word : words) {
                if (word.contains(searchWord)) // учитываем регистр!
                    count++;
            }
        }
        System.out.print("\n The sequence of characters(word) " + searchWord + " was found " + count +" times");
    }

}


