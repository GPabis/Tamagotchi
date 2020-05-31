package org.example.AnimalObserver;

import org.example.Animal.Animal;
import org.example.AnimalObserver.StatDecresingObservers.StatDecresing;

public class AnimalObserversEngine {
    private final static StatDecresing statDecresing = new StatDecresing();
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
            Thread.sleep(3600);
        } catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        statDecresing.statDecresingUpdate(animal);
    }

    public void animalEngineRun(Animal animal){
        new Thread(() -> {
            while(runing){
                decresingStatTimer(animal);
            }
        }).start();
    }
}
