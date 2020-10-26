package ru.geekbrains.lesson6;
import java.util.Scanner;
//1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
// При подаче массива другого размера необходимо бросить исключение MyArraySizeException. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
//2. Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
//3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException и вывести результат расчета.

public class Main {

    public static void main(String[] args) {
        int n, m;
        Scanner enterArrayNM = new Scanner(System.in);

        System.out.println("Введите количество строк и столбцов для двумерного массива");
        n = enterArrayNM.nextInt();
        m = enterArrayNM.nextInt();

        String[][] newArr = new String[n][m];
        try {
            create(newArr, enterArrayNM, n, m);
            System.out.println("Sum is " + sum(newArr, n, m));
        } catch (SizeException | DataException e) {
            e.printStackTrace();
        }
    }

    private static void create(String[][] arr, Scanner enterArrayNM, int n, int m) throws SizeException {
        if (n != 4 || m != 4) throw new SizeException(n, m);
        System.out.println("Создание массива ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Строка " + i + " столбец " + j);
                arr[i][j] = enterArrayNM.next();
            }
        }
        print(arr);
    }

    private static int sum(String[][] arr, int n, int m) throws DataException {
        int sum = 0;
        int[][] arrayInt = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    arrayInt[i][j] = Integer.parseInt(arr[i][j]);
                    sum += arrayInt[i][j];
                } catch (NumberFormatException e) {
                    throw new DataException(i, j);
                }
            }
        }
        printInt(arrayInt);
        return sum;
    }
    private static void printInt(int[][] arr) {
        System.out.println("Преобразованный массив типа Int ");
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }
    }

    private static void print(String[][] arr) {
        for (String[] strings : arr) {
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.println();
        }
    }
}