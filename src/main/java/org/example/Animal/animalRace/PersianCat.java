package org.example.Animal.animalRace;

import org.example.AnimalRaceType;
import org.example.AnimalType;

public class PersianCat implements CatRaces {
    public final String discription = "The dignified and docile Persian cat is known for being quiet and sweet.\n" +
                                      "\n" +
                                      "Although Persians tend to be relaxed and easygoing, they also command an air of royalty. They may not be quick to hiss or scratch, but that doesn’t mean they won’t become annoyed when bothered by loud children or pets.\n" +
                                      "\n" +
                                      "However, those who treat the Persian cat with the dignity and gentleness they deserve will be rewarded with an affectionate lap cat who enjoys a good petting, or even a brush through their hair. If you want a best friend who will return all your dedication and love in kind, the Persian may be the right feline for your family.\n";
    public final AnimalRaceType raceName = AnimalRaceType.PersianCat;

    @Override
    public AnimalType getAnimalType() {
        return CatRaces.animalType;
    }

    @Override
    public AnimalRaceType getRaceName() {
        return this.raceName;
    }

    @Override
    public String getRaceDiscription() {
        return this.discription;
    }
}
