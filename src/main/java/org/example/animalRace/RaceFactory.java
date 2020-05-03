package org.example.animalRace;

import org.example.AnimalRaceType;

public class RaceFactory {
    public static Race createRace(AnimalRaceType type){
        switch (type){
            case PersianCat:
                return new PersianCat();
            case BritishShorthairCat:
                return new BritishShorthairCat();
            default:
                throw new IllegalArgumentException("Animal Race Type not supported");
        }
    }
}
