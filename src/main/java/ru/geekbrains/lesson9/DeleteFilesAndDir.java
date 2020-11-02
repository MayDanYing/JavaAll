package ru.geekbrains.lesson9;
import java.io.File;

//Напишите метод, который позволяет удалить каталог с вложенными файлами и каталогами
// (методы для обхода содержимого каталогов есть в классе File или Files).

public class DeleteFilesAndDir {
    public static void main(String[] args)  {
        deleteDirectory(new File("C:/Users/admin/Documents/java/join"));

        //проверяем удалился ли файл в папке
        System.out.println (new File("C:/Users/admin/Documents/java/join/Chapter01.txt").exists() ?
                "File exists" :
                "File was deleted and doesn't exist anymore");

        //проверяем удалилась ли папка
        System.out.println (new File("C:/Users/admin/Documents/java/join").exists() ?
                "Dir exists" :
                "Dir was deleted and doesn't exist anymore");
    }

    public static void deleteDirectory(File directory) {
        File[] files = directory.listFiles();
        if(files!=null) {
            for(File f: files) {
                if(f.isDirectory()) {
                    deleteDirectory(f);
                } else {
                    f.delete();
                }
            }
        }
        directory.delete();
    }
}
