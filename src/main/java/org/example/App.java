package org.example;

import org.example.Animal.Animal;

public class App
{
    public static void main( String[] args )
    {
        Animal animal = new Animal();
        animal.createAnimal(AnimalRaceType.PersianCat);

        System.out.println(animal.getAnimalStats().getEntertainment().getStat());
        animal.getAnimalStats().getEntertainment().becomeBored(10);
        System.out.println(animal.getRace().getRaceDiscription());
        System.out.println(animal.getAnimalDesign().getHappyIMG().getIMG());
        System.out.println(animal.getAnimalStats().getEntertainment().getStat());
    }
}
