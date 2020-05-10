package org.example.animalDesign;

public class AnimalDesign {
    private DeadIMG deadIMG;
    private IconIMG iconIMG;
    private HappyIMG happyIMG;
    private SadIMG sadIMG;
    private SleepIMG sleepIMG;

    public void createAnimalDesign(final DesignFactory factory){
        setDeadIMG(factory.createDeadDesign());
        setHappyIMG(factory.createHappyDesign());
        setIconIMG(factory.createIconDesign());
        setSadIMG(factory.createSadDesign());
        setSleepIMG(factory.createSleepDesign());
    }

    public DeadIMG getDeadIMG(DesignFactory factory) {return factory.createDeadDesign();}

    public DeadIMG getDeadIMG(){return this.deadIMG;}

    private void setDeadIMG(final DeadIMG deadIMG){this.deadIMG = deadIMG;}

    public IconIMG getIconIMG(DesignFactory factory){return factory.createIconDesign();}

    public IconIMG getIconIMG(){return this.iconIMG;}

    private void setIconIMG(final IconIMG iconIMG){this.iconIMG = iconIMG;}

    public HappyIMG getHappyIMG(DesignFactory factory){return factory.createHappyDesign();}

    public HappyIMG getHappyIMG(){return this.happyIMG;}

    private void setHappyIMG(final HappyIMG happyIMG){this.happyIMG = happyIMG;}

    public SadIMG getSadIMG(DesignFactory factory){return factory.createSadDesign();}

    public SadIMG getSadIMG(){return this.sadIMG;}

    private void setSadIMG(final SadIMG sadIMG){this.sadIMG = sadIMG;}

    public SleepIMG getSleepIMG(DesignFactory factory){return factory.createSleepDesign();}

    public SleepIMG getSleepIMG(){return this.sleepIMG;}

    private void setSleepIMG(final SleepIMG sleepIMG){this.sleepIMG = sleepIMG;}
}
