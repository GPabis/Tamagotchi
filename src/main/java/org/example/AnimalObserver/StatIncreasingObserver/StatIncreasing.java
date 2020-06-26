package org.example.AnimalObserver.StatIncreasingObserver;

import org.example.Animal.Animal;

import java.util.ArrayList;
import java.util.List;

public class StatIncreasing {
    private static final EntIncrObserver entIncrObserver = new EntIncrObserver();
    private static final FatiIncrObserver fatiIncrObserver = new FatiIncrObserver();
    private static final HealIncrObserver healIncrObserver = new HealIncrObserver();
    private static final HunIncrObserver hunIncrObserver = new HunIncrObserver();
    private List<StatIncreasingObserver> increasingObservers;

    public StatIncreasing(){
        increasingObservers = new ArrayList<>();
    }

    public void addEntIncrObserver(){
        increasingObservers.add(entIncrObserver);
    }

    public void removeEntIncrObserver(){
        increasingObservers.remove(entIncrObserver);
    }

    public void addFatiIncrObserver(){
        increasingObservers.add(fatiIncrObserver);
    }

    public void removeFatiIncrObserver(){
        increasingObservers.remove(fatiIncrObserver);
    }

    public void addHealIncrObserver(){
        increasingObservers.add(healIncrObserver);
    }

    public void removeHealIncrObserver(){
        increasingObservers.remove(healIncrObserver);
    }

    public void addHunIncrObserver(){
        increasingObservers.add(hunIncrObserver);
    }

    public void removeHunIncrObserver(){
        increasingObservers.remove(hunIncrObserver);
    }

    public void statsIncreasingUpdate(Animal animal){
        for(StatIncreasingObserver obs : increasingObservers){
            obs.update(animal);
        }
        removeFullIncrStatObserver(animal);
    }

    public void isEntFull(Animal animal){
        if(animal.getAnimalStats().getEntertainment().isStatFull()) removeEntIncrObserver();
    }

    public void isFatiFull(Animal animal){
        if(animal.getAnimalStats().getFatigue().isStatFull()) removeFatiIncrObserver();
    }

    public void isHealFull(Animal animal){
        if(animal.getAnimalStats().getHealth().isStatFull()) removeHealIncrObserver();
    }

    public void isHunFull(Animal animal){
        if(animal.getAnimalStats().getHunger().isStatFull()) removeHunIncrObserver();
    }

    public void removeFullIncrStatObserver(Animal animal){
        isEntFull(animal);
        isFatiFull(animal);
        isHealFull(animal);
        isHunFull(animal);
    }
}
