package org.example.animalStatistics;

import org.example.AnimalType;

public class StatsFactoryMaker {

    public static StatsFactory makeStatsFactory(AnimalType type){
        switch (type){
            case CAT:
                return new CatStatsFactory();
            default:
                throw new IllegalArgumentException("AnimalType not supported.");
        }
    }
}
