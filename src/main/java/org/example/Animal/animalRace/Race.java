package org.example.Animal.animalRace;

import org.example.AnimalRaceType;
import org.example.AnimalType;

public interface Race {
    public AnimalType getAnimalType();
    public AnimalRaceType getRaceName();
    public String getRaceDiscription();
}
