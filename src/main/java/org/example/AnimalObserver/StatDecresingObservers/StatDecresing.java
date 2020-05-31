package org.example.AnimalObserver.StatDecresingObservers;

import org.example.Animal.Animal;

import java.util.ArrayList;
import java.util.List;

public class StatDecresing {

    private List<StatsDecresingObserver> decresingObservers;
    private static final EntertainmentDecresingObserver entertainmentDecresingObserver
            = new EntertainmentDecresingObserver();
    private static final HungerDecresingObserver hungerDecresingObserver
            = new HungerDecresingObserver();
    private static final FatigueDecresingObserver fatigueDecresingObserver
            = new FatigueDecresingObserver();
    private static final HealthDecresingObserver healthDecresingObserver
            = new HealthDecresingObserver();

    public StatDecresing(){
        decresingObservers = new ArrayList<>();
    }

    public void addEntDecObserver(){
        decresingObservers.add(entertainmentDecresingObserver);
    }

    public void removeEntDecObserver(){
        decresingObservers.remove(entertainmentDecresingObserver);
    }

    public void addHungDecObserver(){
        decresingObservers.add(hungerDecresingObserver);
    }

    public void removeHungDecObserver(){
        decresingObservers.remove(hungerDecresingObserver);
    }

    public void addFatiDecObserver(){
        decresingObservers.add(fatigueDecresingObserver);
    }

    public void removeFatiDecObserver(){
        decresingObservers.remove(fatigueDecresingObserver);
    }

    public void addHealDecObserver(){
        decresingObservers.add(healthDecresingObserver);
    }

    public void removeHealDecObserver(){
        decresingObservers.remove(healthDecresingObserver);
    }

    public void addAllDecresingObservers(){
        addEntDecObserver();
        addFatiDecObserver();
        addHealDecObserver();
        addHungDecObserver();
    }

    public void statDecresingUpdate(Animal animal) {
        for(StatsDecresingObserver obs : decresingObservers){
            obs.update(animal);
        }
    }
}
