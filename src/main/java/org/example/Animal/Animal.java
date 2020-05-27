package org.example.Animal;

import org.example.Animal.animalDesign.AnimalDesign;
import org.example.Animal.animalDesign.DesignFactoryMaker;
import org.example.Animal.animalRace.Race;
import org.example.Animal.animalStatistics.AnimalStats;
import org.example.Animal.animalStatistics.StatsFactoryMaker;
import org.example.AnimalRaceType;
import static org.example.Animal.animalRace.RaceFactory.createRace;

public class Animal {
    private AnimalDesign animalDesign;
    private AnimalStats animalStats;
    private Race race;

    public void createAnimal(AnimalRaceType animalRaceType){
        setRace(animalRaceType);
        setAnimalDesign(this.race);
        setAnimalStats(this.race);
    }

    public void setRace(AnimalRaceType animalRaceType) {
        this.race = createRace(animalRaceType);
    }

    public Race getRace(){
        return this.race;
    }

    public void setAnimalDesign(Race race) {
        this.animalDesign = new AnimalDesign();
        this.animalDesign.createAnimalDesign(DesignFactoryMaker.makeDesignFactory(race.getRaceName()));
    }

    public AnimalDesign getAnimalDesign() {
        return animalDesign;
    }

    public void setAnimalStats(Race race) {
        this.animalStats = new AnimalStats();
        this.animalStats.createAnimalStats(StatsFactoryMaker.makeStatsFactory(race.getAnimalType()));
    }

    public AnimalStats getAnimalStats() {
        return animalStats;
    }
}
