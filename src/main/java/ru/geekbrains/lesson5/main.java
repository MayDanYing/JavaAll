package ru.geekbrains.lesson5;

//1. Добавить в код предыдущего ДЗ новые виды препятствий бессейн и пропасть.
// Бассейн можно только переплыть, а пропасть только перелететь.
//  2. Добавить новых участников, например птицу и рыбку.
//  3. При помощи интерфейсов учесть тот факт, что человек может бегать, прыгать и плавать,
//  но не может летать; рыба может только плавать, кошка не может плавать и т.д.

//Учитывая преыдущие условия задания, полагаем, что если Человек(или любой другой участник) не перепрыгнул стену или другой этап,
// то дальше по заданию не идет!

public class main {

    public static void main(String[] args) {
        Competition first = new Competition(new Run(100), new Wall(1.40), new SwimmingPool(100), new Abyss(10));
        Competitors competitors = new Competitors("Array of competitors",
                new HumanBeing("James"),
                new Kitty ("Fluffy"),
                new Robot("Jericho"),
                new Fish("Chuchu"),
                new Bird("Chiky"));
        first.action(competitors);
        competitors.Info();
           }
    }


