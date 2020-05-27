package org.example.Animal.animalDesign;

import org.example.AnimalRaceType;

public class DesignFactoryMaker {
    public static DesignFactory makeDesignFactory(AnimalRaceType type){
        switch (type){
            case PersianCat:
                return new PersianCatDesignFactory();
            default:
                throw new IllegalArgumentException("AnimalRaceType not supported.");
        }
    }
}
