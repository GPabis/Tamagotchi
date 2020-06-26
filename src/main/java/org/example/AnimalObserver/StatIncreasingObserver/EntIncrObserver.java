package org.example.AnimalObserver.StatIncreasingObserver;

import org.example.Animal.Animal;

public class EntIncrObserver implements StatIncreasingObserver{
    @Override
    public void update(Animal animal){
        animal.getAnimalStats().getEntertainment().play(10);
    }
}
