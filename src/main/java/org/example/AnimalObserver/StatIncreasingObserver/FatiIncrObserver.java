package org.example.AnimalObserver.StatIncreasingObserver;

import org.example.Animal.Animal;

public class FatiIncrObserver implements StatIncreasingObserver {
    @Override
    public void update(Animal animal) {
        animal.getAnimalStats().getFatigue().sleep(1);
    }
}
