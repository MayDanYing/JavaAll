package ru.geekbrains.lesson6;
public class SizeException extends Exception {
    int n, m;

    public SizeException(int n, int m) {
        super("Неправильно ввели количество строк и столбцов. Массив должен быть 4на4. Вы ввели строк" + n + ", столбцов " + m);
        this.n = n;
        this.m = m;
    }
}
