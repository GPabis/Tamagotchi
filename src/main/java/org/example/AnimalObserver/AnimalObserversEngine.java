package org.example.AnimalObserver;

import org.example.Animal.Animal;
import org.example.AnimalObserver.StatDecresingObservers.StatDecresing;
import org.example.AnimalObserver.StatIncreasingObserver.StatIncreasing;

public class AnimalObserversEngine {
    private final static StatDecresing statDecresing = new StatDecresing();
    private final static StatIncreasing statIncreasing = new StatIncreasing();
    private boolean runing;

    public AnimalObserversEngine(){
        statDecresing.addAllDecresingObservers();
        runing = true;
    }

    public StatDecresing getStatDecresing(){
        return statDecresing;
    }

    public void decresingStatTimer(Animal animal){
        try {
            Thread.sleep(1000);
        } catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        statDecresing.statDecresingUpdate(animal);
        System.out.println("Entertainment: " + animal.getAnimalStats().getEntertainment().getStat());
    }

    public void increasingStatTimer(Animal animal){
        try {
            Thread.sleep(1000);
        } catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        statIncreasing.statsIncreasingUpdate(animal);
    }

    public void animalEngineRun(Animal animal){
        new Thread(() -> {
            while(runing){
                decresingStatTimer(animal);
                increasingStatTimer(animal);
            }
        }).start();
    }
}
