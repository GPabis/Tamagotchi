package org.example.Animal.animalDesign;

public class PersianCatDesignFactory implements DesignFactory {
    @Override
    public DeadIMG createDeadDesign() {
        return new PersianCatDeadIMG();
    }

    @Override
    public HappyIMG createHappyDesign() {
        return new PersianCatHappyIMG();
    }

    @Override
    public IconIMG createIconDesign() {
        return new PersianCatIconIMG();
    }

    @Override
    public SadIMG createSadDesign() {
        return new PersianCatSadIMG();
    }

    @Override
    public SleepIMG createSleepDesign() {
        return new PersianCatSleepIMG();
    }
}
