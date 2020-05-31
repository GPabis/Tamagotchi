package org.example.AnimalObserver.StatDecresingObservers;

import org.example.Animal.Animal;

public class HungerDecresingObserver implements StatsDecresingObserver {
    @Override
    public void update(Animal animal) {
        animal.getAnimalStats().getHunger().starve(1);
    }
}
