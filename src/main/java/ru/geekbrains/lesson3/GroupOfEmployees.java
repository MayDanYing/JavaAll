package ru.geekbrains.lesson3;

//Создайте класс Группа, включающий в себя название группы и массив из максимум 10 сотрудников
// (не все элементы массива могут быть заполнены).
// Реализуйте возможность добавлять сотрудников в этот массив, удалять их из него по индексу,
// и удалять всех разом;
//задание 3 - В классе Группа должен быть метод, позволяющий отпечатать информацию обо всех сотрудниках,
// входящих в эту группу;

import java.util.Arrays;

public class GroupOfEmployees {
   String nameOfGroup;

    public String getNameOfGroup() {
        return nameOfGroup;
    }

    public GroupOfEmployees() {

    }

    static int n = 3;
    static Employee developers[] = new Employee[n];

    public static void main(String[] args) {
        GroupOfEmployees dev = new GroupOfEmployees();
        dev.fillIn(); //заполнение массива
        dev.printArray(); //печать
        System.out.println("");
        dev.addEmployee("Alex", "alex@gmail.com", 35, "head of department"); //добавление сотрудника Alex
        dev.deleteEmployee(1);  //удаление по индексу 1
    }

     void fillIn() { //заполняем массив
        developers[0] = new Employee("Mark", "mark@gmail.com", 26, "developer");
        developers[1] = new Employee("Andrew", "andrew@gmail.com", 30, "developer");
        developers[2] = new Employee("James", "james@gmail.com", 28,"junior developer");
    }

     void addEmployee(String name, String email, int age, String position) { //добавляем сотрудника

        System.out.println("\n"+"Adding Employee ");
        Employee developersnew[] = new Employee[n];
        developersnew = Arrays.copyOf(developers,developers.length+1);
        developersnew[developers.length] = new Employee(name,email,age,position);

        for (int i = 0; i < n+1; i++) {
            System.out.println(developersnew[i].getName() + "\t" +
                    developersnew[i].getEmail() + "\t" +
                    developersnew[i].getAge() + "\t" +
                    developersnew[i].getPosition());
        }
    }

    void printArray() {   //В классе Группа должен быть метод, позволяющий отпечатать информацию обо всех сотрудниках,
        // входящих в эту группу;
        nameOfGroup = "Developers";
        System.out.println("Group is "+nameOfGroup +"\n");
        for (int i = 0; i < n; i++) {
            System.out.println(developers[i].getName() + "\t" +
                    developers[i].getEmail() + "\t" +
                    developers[i].getAge() + "\t" +
                    developers[i].getPosition());
        }
    }

    void deleteEmployee(int x){  // удаление сотрудника по индексу
        Employee a[] = new Employee[developers.length-1];
        int j = 0;
        for (int i = 0; i < developers.length; i++) {
            if (i == x ){
                continue;
            }
            else {
                a[j] = developers[i];
                j++;
            }
        }

        System.out.println();
        System.out.print("*****************************\n");

        for (int i = 0; i < a.length; i++) {
            System.out.println(developers[i].getName() + "\t" +
                    developers[i].getEmail() + "\t" +
                    developers[i].getAge() + "\t" +
                    developers[i].getPosition());
        }
        System.out.println();
        System.out.print("*****************************\n");
    }

    void deleteAll() {  // удаление всего
        developers = new Employee[n];
    }
}