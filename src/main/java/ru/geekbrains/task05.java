package ru.geekbrains;
import java.util.Random;

//*Написать метод, которая получает на вход массив и перемешивает
// его элементы случайным образом. Для генерации случайного целого числа используйте класс Random.
public class task05 {

    public static void main(String[] args) {
    mixingUpIntegers();
    }

    public static void mixingUpIntegers() {

        int N = 10;
        int arr[] = new int[N];

        Random rand = new Random();
        for (int i = 0; i < arr.length; i++)
            arr[i] = rand.nextInt( 100);

        System.out.print("массив A: \n");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+"\t");
        System.out.println();
//
        int index, tmp;
        System.out.print("массив B: \n");
        for (int i = arr.length -1; i >= 0; i--)
        {
            index = rand.nextInt(i + 1);
            tmp = arr[index];
            arr[index] = arr[i];
            arr[i] = tmp;
            System.out.print(arr[i]+"\t");
        }


    }
}
