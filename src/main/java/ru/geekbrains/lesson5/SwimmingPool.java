package ru.geekbrains.lesson5;
public class SwimmingPool extends Obstacle {

    private int swimDist;
    public SwimmingPool(int swimDist) {
        this.swimDist = swimDist;
   }

    @Override
    public String action(Contestant contestants) {
        if (contestants instanceof AbleToSwim) {
            return ((AbleToSwim) contestants).swim();
        }
        return new String(contestants.getResult() + "swim in the swimming pool");
    }

}