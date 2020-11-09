package ru.geekbrains.lesson12;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class StreamApiHM {

        //************************************************************
        //1. Взять строку, состоящую из 100 слов разделенных пробелом,
        // получить список слов длиннее 5 символов, и склеить их в одну строку с пробелом в качестве разделителя;

       static List<String> string = new ArrayList<>(Collections.singletonList("When Mr. Bilbo Baggins of Bag End announced that he would shortly be celebrating his eleventy-first birthday with a party of special magnificence, there was much talk and excitement in Hobbiton. Bilbo was very rich and very peculiar, and had been the wonder of the Shire for sixty years, ever since his remarkable disappearance and unexpected return. The riches he had brought back from his travels had now become a local legend, and it was popularly believed, whatever the old folk might say that the Hill at Bag End was full of tunnels stuffed with treasure. And if that was"));

    //************************************************************
       //2.Найти список уникальных слов в двумерном массиве размером 5х5;

      static String[][] someList = {
        {"banana", "apple", "peach", "watermelon", "orange"},
        {"lemon", "strawberry", "avocado", "apple", "peach"},
        {"banana", "apple", "peach", "watermelon", "orange"},
        {"avocado", "papaya", "dragonfruit", "litchi", "mango"},
        {"mango", "strawberry", "avocado", "apple", "peach"}};

    //************************************************************
    //3. Посчитать сумму четных чисел в пределах от 100 до 200 (включительно);
    // выполнено сразу в main

    //4. Посчитать суммарную длину строк в одномерном массиве;
    static String[] arr = {"hello", "bye", "good day", "good night", "good morning"};

    //5. Из массива слов получить первые три слова в алфавитном порядке;
    static List<String> stringy = new ArrayList<>(Arrays.asList( "there", "was", "much", "talk", "and", "excitement", "hobbiton", "bilbo", "peculiar"));


    public static void main(String[] args) {

        //######### Задание 1
      //считаем слова, их 100
       long count = string.stream()
                .flatMap(line -> Arrays.stream(line.split(" ")))
                .count();
        System.out.println(count);

     // соединяем
        String collect = string.stream()
                .flatMap(line -> Arrays.stream(line.split(" ")))
                .filter(word -> word.length() >5)
                .collect(Collectors.joining(" "));
              //  .reduce("",(a,b) -> a+" "+b);
        System.out.println("\n №1. New string with words>5:\n" + collect);

       //######### Задание 2
        String fruits = Arrays.stream(someList)
                .flatMap(Arrays::stream)
                .distinct()
                .sorted()
                .collect(Collectors.joining(" "));
        System.out.println("\n №2. New string of unique words:\n" + fruits);

        //************************************************************
        //3. Посчитать сумму четных чисел в пределах от 100 до 200 (включительно);

        OptionalInt countSum = IntStream.rangeClosed(100, 200)
                .filter(x -> x % 2 == 0)
                .reduce((acc, x) -> acc+x);
        System.out.println("\n №3. New sum:\n" + countSum.getAsInt());

        //######### Задание 4
        int sum = Arrays.stream(arr).mapToInt(String::length).sum();
        System.out.println("\n №4. Arr has strings with length equal " + sum);

        //######### Задание 5
        String threeWords = stringy.stream()
                .sorted(Comparator.naturalOrder())
                .limit(3)
                .collect(Collectors.joining(" "));

        System.out.println("\n №5. New string:\n" + threeWords);
    }
}
