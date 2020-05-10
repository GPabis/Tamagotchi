package org.example.animalDesign;

public interface DesignFactory {
    DeadIMG createDeadDesign();
    HappyIMG createHappyDesign();
    IconIMG createIconDesign();
    SadIMG createSadDesign();
    SleepIMG createSleepDesign();
}
