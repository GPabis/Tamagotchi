package org.example;

import org.example.Animal.Animal;
import org.example.AnimalObserver.AnimalObserversEngine;

import javax.swing.*;
import java.awt.*;

public class App
{
    public static void main( String[] args )
    {
        Animal animal = new Animal();
        animal.createAnimal(AnimalRaceType.PersianCat);
        AnimalObserversEngine engine = new AnimalObserversEngine();
        engine.animalEngineRun(animal);
        engine.getStatDecresing().addAllDecresingObservers();
        System.out.println(animal.getRace().getRaceName());
        System.out.println(animal.getRace().getAnimalType());
        System.out.println(animal.getRace().getRaceDiscription());
        JFrame frame = new JFrame();
        frame.getContentPane().setLayout(new FlowLayout());
        frame.getContentPane().add(new JLabel(new ImageIcon(animal.getAnimalDesign().getHappyIMG().getIMG())));
        frame.getContentPane().add(new JLabel(new ImageIcon(animal.getAnimalDesign().getHappyIMG().getResizedIMG(150, 160))));
        frame.pack();
        frame.setVisible(true);



    }
}
