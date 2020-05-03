package org.example;

import org.example.animalStatistics.*;

public class App 
{
    public static void main( String[] args )
    {
        AnimalStats animalStats = new AnimalStats();
        animalStats.createAnimalStats(StatsFactoryMaker.makeStatsFactory(AnimalType.CAT));
    }
}
