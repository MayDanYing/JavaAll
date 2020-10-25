package ru.geekbrains.lesson6;

public class SizeException extends Exception {

    int n, m;

    public SizeException(int row, int column) {
        super("Неправильно ввели количество строк и столбцов. Массив должен быть 4на4. Вы ввели " + row + ", column " + column);
        this.n = n;
        this.m = m;
    }
}
