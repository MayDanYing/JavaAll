package ru.geekbrains.lesson1;
import java.util.Scanner;

//Написать программу, которая выводит на экран равнобедренный треугольник из звездочек. Ширина основания - любое нечетное число. Начинать вывод с вершины.

public class task01 {
    public static void main(String[] args) {


triangle();

    }

    public static void triangle() {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Input number");
        n = in.nextInt();
        if (n%2!=0) {
        for(int i=(n/2+1);i<=n; i++)
        {
            for(int j=0; j<=i; j++)
                if(j<n-i+1)
                    System.out.print( " ");
                else
                    System.out.print( "*");

            System.out.println();
        }

        }
        System.out.println("Incorrect length, length should be odd.");
    }
}
