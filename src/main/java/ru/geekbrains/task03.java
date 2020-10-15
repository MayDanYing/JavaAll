package ru.geekbrains;

//Написать метод, который в качестве параметра получает число секунд в виде целого числа и преобразует его в строку вида
// чч:мм:сс, где чч - кол-во часов, мм - количество минут, сс - количество секунд в исходном значении.
// Подсказка - использовать операцию деления (/) и остатка от деления (%). Примеры 62 - "00:01:02",
// 130 - "00:02:10", 3750 - "01:02:30

import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {

time();
    }

    public static void time() {
        int time;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество секунд");
        time = in.nextInt();
        int hours =  (time / 3600);
        int minutes =  (time / 60) % 60;
        int seconds = time % 60;
        String Hours = String.format("%02d", hours);
        String Minutes = String.format("%02d", minutes);
        String Seconds = String.format("%02d", seconds);
        System.out.println("time is " + Hours+":"+Minutes+":"+ Seconds);
    }
}
