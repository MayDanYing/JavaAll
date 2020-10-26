package ru.geekbrains.lesson1;
import java.util.Random;

public class homew1 {


            public static void main(String[] args)
        {
            int []arr = new int[10];

            Random rand = new Random();

            for (int i = 0; i < arr.length; i++)
                arr[i] = rand.nextInt( 10);

            int MIN = arr[0];
            int MAX = arr[0];

            for (int j : arr)
                System.out.print(j + "\t");

            System.out.println();

            for (int j : arr) {
                if (MAX <= j)
                    MAX = j;
                if (MIN >= j)
                    MIN = j;
            }
            System.out.println("MAX = " + MAX);
            System.out.println("MIN = " + MIN);
        }
    }

