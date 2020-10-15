package ru.geekbrains;


//Написать реализацию алгоритма сортировки массива методом выбора (selection sort).
//        в массиве находим наименьшее значение и меняем его местами с нулевым элементом массива
//        далее находим наименьшее значение в оставшейся части массива и меняем его местами с первым элементом
//        продолжаем до тех пор пока весь массив не будет отсортирован

public class task02 {

    public static void main(String[] args) {

 sortingWithMin();
 sortingWithselectionsort();

    }

    public static void sortingWithMin() {

        int n = 5;
        int a[] = {5,4,3,2,1};

        int tmp, imin;

        for(int i =0; i<(n-1); i++){

            imin = i;
            for (int j =i; j< a.length; j++)
                if (a[j]< a[imin])
                    imin =j;
                tmp = a[i];
                a[i]=a[imin];
                a[imin]=tmp;
        }

        System.out.print("массив отсортированный 1: \n");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i]+"\t");

    }

    public static void sortingWithselectionsort() {

        int n = 5;
        int a[] = {5,4,3,2,1};

        int tmp, imin;

        for(int i =0; i<a.length; i++){

            imin = i;
            for (int j =i+1; j< a.length; j++)
                if (a[j]< a[imin])
                    imin =j;
            tmp = a[i];
            a[i]=a[imin];
            a[imin]=tmp;
        }
        System.out.println();
        System.out.print("массив отсортированный 2: \n");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i]+"\t");

    }
}

