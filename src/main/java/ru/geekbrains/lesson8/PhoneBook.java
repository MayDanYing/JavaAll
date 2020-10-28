package ru.geekbrains.lesson8;
// 2.Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
// В этот телефонный справочник с помощью метода add() можно добавлять записи,
// а с помощью метода get() искать номер телефона по фамилии.
// Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
// тогда при запросе такой фамилии должны выводиться все телефоны.
// Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес),
// взаимодействие с пользователем через консоль и т.д).
// Консоль использовать только для вывода результатов проверки телефонного справочника.

import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {
    HashMap<String, HashSet<String>> phonebook;

    public PhoneBook() {
        this.phonebook = new HashMap<>();
    }

    public void add(String surname, String phone) {
        HashSet<String> p = phonebook.getOrDefault(surname, new HashSet<>());
        p.add(phone);
        phonebook.put(surname, p);
    }

    public void get(String surname) {
        System.out.println("\n Checking the Phonebook\n Surname " + surname +
                ", phone number is " + phonebook.getOrDefault(surname, new HashSet<>()));
    }
}
