package org.example;

import org.example.animalRace.Race;
import org.example.animalRace.RaceFactory;
import org.example.animalStatistics.*;

public class App 
{
    public static void main( String[] args )
    {
        AnimalStats animalStats = new AnimalStats();
        Race race = RaceFactory.createRace(AnimalRaceType.BritishShorthairCat);
        System.out.println(race.getAnimalType());
        System.out.println(race.getRaceName());
        System.out.println(race.getRaceDiscription());
        animalStats.createAnimalStats(StatsFactoryMaker.makeStatsFactory(race.getAnimalType()));
        System.out.println(animalStats.getHealth().getStat());
    }
}
