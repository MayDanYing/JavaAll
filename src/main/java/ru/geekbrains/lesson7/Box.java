package ru.geekbrains.lesson7;
import java.util.ArrayList;

//Необходимо реализовать класс Box, в который можно складывать фрукты.
// Коробки условно сортируются по типу фрукта,
// поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
// Для хранения фруктов внутри коробки можно использовать ArrayList;

// Пустой объявленный класс, где Т обозначает тип, который будет заменен реальным типом.
public class Box<T extends Fruit>{

    private ArrayList<T> packOfFruits; // список фруктов в коробке

    private float boxWeight; //вес коробки

    public Box() {
        packOfFruits = new ArrayList<>();
    }

    // Сделать метод getWeight(), который высчитывает вес коробки
    public float getWeight() {

        if (packOfFruits.size() != 0) {
            int i = 0;
            boxWeight = packOfFruits.size() * packOfFruits.get(i).onePieceWeight();
        } else {
            System.out.println("Box is empty");
        }
        return boxWeight;
    }
// Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той,
// которую подадут в compare() в качестве параметра.
    public boolean compare(Box<?> secondBox) {
        return getWeight() == secondBox.getWeight();
    }

//Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
// Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
// Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты,
// которые были в первой;
    public void moveFruits(Box<T> secondBox) {
        secondBox.packOfFruits.addAll(this.packOfFruits);
        packOfFruits.clear();
    }

//Не забываем про метод добавления фрукта в коробку.
    public void addFruitToBox(T addedFruit) {
        packOfFruits.add(addedFruit);
    }
}
