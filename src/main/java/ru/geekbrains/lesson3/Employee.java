package ru.geekbrains.lesson3;

// Создайте класс Сотрудник, с полями: имя, email, возраст, должность.
// Сотрудник должен уметь отпечатать в консоль информацию о себе;

public class Employee {

    private String name;
    private String email;
    private int age;
    private String position;

    public Employee(String name, String email, int age, String position) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.position = position;
    }

    public Employee(String name) { // этот конструктор нужен для задания 2
        this.name = name;
    }

    public Employee(String name, String email) { // пустой конструктор нужен для задания 2
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void information() {
        System.out.println("Here is the info about employee: Name - " + name +"; Email - "+ email +"; Age - " +age + "; Position + "+ position);
    }

    public static void main(String[] args) {
        Employee Mark = new Employee("Mark", "mark@gmail.com", 26, "Software engineer");
        Mark.information();

    }

}
