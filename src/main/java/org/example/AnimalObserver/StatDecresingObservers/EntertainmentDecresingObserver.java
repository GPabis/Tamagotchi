package org.example.AnimalObserver.StatDecresingObservers;

import org.example.Animal.Animal;

public class EntertainmentDecresingObserver implements StatsDecresingObserver {

    @Override
    public void update(Animal animal) {
        animal.getAnimalStats().getEntertainment().becomeBored(1);
    }
}
