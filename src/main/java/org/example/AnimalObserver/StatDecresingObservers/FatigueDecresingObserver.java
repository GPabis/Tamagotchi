package org.example.AnimalObserver.StatDecresingObservers;

import org.example.Animal.Animal;

public class FatigueDecresingObserver implements StatsDecresingObserver {
    @Override
    public void update(Animal animal) {
        animal.getAnimalStats().getFatigue().becomeSleepy(1);
    }
}
