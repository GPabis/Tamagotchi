package org.example.AnimalObserver.StatDecresingObservers;

import org.example.Animal.Animal;

public class HealthDecresingObserver implements StatsDecresingObserver {
    @Override
    public void update(Animal animal) {
        if(isTakingADamage(animal)){
        animal.getAnimalStats().getHealth().takeDamage(1);
        }
    }

    public boolean isTakingADamage(Animal animal){
        if (animal.getAnimalStats().getHunger().isStatZero()) return true;
        return false;
    }
}
