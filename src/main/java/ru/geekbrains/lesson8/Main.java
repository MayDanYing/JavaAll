package ru.geekbrains.lesson8;

//1.Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
// Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
// Посчитать, сколько раз встречается каждое слово.
// 2.Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
// В этот телефонный справочник с помощью метода add() можно добавлять записи,
// а с помощью метода get() искать номер телефона по фамилии.
// Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
// тогда при запросе такой фамилии должны выводиться все телефоны.
// Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес),
// взаимодействие с пользователем через консоль и т.д).
// Консоль использовать только для вывода результатов проверки телефонного справочника.

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //Задание 1. Массив с именами котеек.
        String[] names = {"Fluffy", "Sammy", "Fatty", "Fluffy", "Bitty", "Skinny", "Jeffrey", "Jimmy", "Angy", "Jimmy", "Mickey", "Angy"};
        Map<String, Integer> catsNames = new HashMap<>();

        for (String name : names) {
            Integer quantity = catsNames.get(name);
            if (quantity == null) {
                catsNames.put(name, 1);
            } else {
                catsNames.put(name, quantity + 1);
            }
        }
            System.out.println("\n" + catsNames);

        //Задание 2. Phonebook

        PhoneBook newBook = new PhoneBook();
        newBook.add("Johnson", "+12349876456");
        newBook.add("Mitchell", "+86533578852");
        newBook.add("Biden", "+85234569978");
        newBook.add("Mitchell", "+7932877765");

       // Search
        newBook.get("Mitchell");
        newBook.get("Biden");
        newBook.get("Johnson");

        }
    }
