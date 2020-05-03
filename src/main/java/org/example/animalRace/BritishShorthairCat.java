package org.example.animalRace;
import org.example.AnimalRaceType;
import org.example.AnimalType;

public class BritishShorthairCat implements CatRaces {
    public final String discription = "Full of British reserve, the British Shorthair cat has a quiet voice and is an undemanding companion.\n" +
                                      "\n" +
                                      "While not overly affectionate, the British Shorthair tends to get along just fine with everyone. They’re mellow and will tolerate other pets, and even though they may not seek out snuggles at every opportunity, they’re happy to be scooped up for a good cuddle.\n" +
                                      "\n" +
                                      "While some cats get a reputation for being high-strung and jumpy, the British Shorthair is anything but. If you’re looking for a best buddy who stays calm as a cucumber and won’t do much pestering, this might just be the feline for you.\n";
    public final AnimalRaceType raceName = AnimalRaceType.BritishShorthairCat;

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
