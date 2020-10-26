package ru.geekbrains.lesson6;
public class DataException extends Exception {
        int n, m;

        public DataException(int n, int m) {
            super("Неверное количество строк и столбцов. Вы ввели " + n + " строк и " + m+"столбцов");
            this.n = n;
            this.m = m;
        }

}


