package org.example.AnimalObserver.StatIncreasingObserver;

import org.example.Animal.Animal;

public class HunIncrObserver implements StatIncreasingObserver {
    @Override
    public void update(Animal animal) {
        animal.getAnimalStats().getHunger().eatFood(20);
    }
}
