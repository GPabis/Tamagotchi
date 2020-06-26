package org.example.AnimalObserver.StatIncreasingObserver;

import org.example.Animal.Animal;

public class HealIncrObserver implements StatIncreasingObserver {
    @Override
    public void update(Animal animal) {
        animal.getAnimalStats().getHealth().takeMedicine(1);
    }
}
