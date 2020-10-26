package ru.geekbrains.lesson1;

//Написать метод, который переворачивает содержимое массива так, что на первом месте оказывается
// последний элемент и т.д.

import java.util.Random;

public class task04 {

    public static void main(String[] args) {
        reverseArr();

    }

    public static void reverseArr() {

        int N = 10;
        int arr[] = new int[N];

        Random rand = new Random();
        for (int i = 0; i < arr.length; i++)
            arr[i] = rand.nextInt( 100);

        System.out.print("массив A: \n");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+"\t");
        System.out.println();

        System.out.print("массив B: \n");
        for (int i = arr.length-1; i >= 0; i--)
            System.out.print(arr[i]+"\t");

    }

}
