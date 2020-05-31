package org.example;

import org.example.Animal.Animal;
import org.example.AnimalObserver.AnimalObserversEngine;

public class App
{
    public static void main( String[] args )
    {
        Animal animal = new Animal();
        animal.createAnimal(AnimalRaceType.PersianCat);
        AnimalObserversEngine engine = new AnimalObserversEngine();
        engine.animalEngineRun(animal);
    }
}
