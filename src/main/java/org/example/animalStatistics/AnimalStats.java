package org.example.animalStatistics;

public class AnimalStats {
    public Entertainment entertainment;
    public Fatigue fatigue;
    public Health health;
    public Hunger hunger;

    public void createAnimalStats(final StatsFactory factory){
        setEntertainment(factory.createEntertainmentStat());
        setFatigue(factory.createFatigueStat());
        setHealth(factory.createHealthStat());
        setHunger(factory.createHungerStat());
    }

    public Entertainment getEntertainment(StatsFactory factory){
        return factory.createEntertainmentStat();
    }

    public Entertainment getEntertainment(){
        return this.entertainment;
    }

    private void setEntertainment(final Entertainment entertainment){
        this.entertainment = entertainment;
    }

    Fatigue getFatigue(final StatsFactory factory){
        return factory.createFatigueStat();
    }

    public  Fatigue getFatigue(){
        return this.fatigue;
    }

    private void setFatigue(final Fatigue fatigue){
        this.fatigue = fatigue;
    }

    Health getHealth(final StatsFactory factory){
        return factory.createHealthStat();
    }

    public Health getHealth(){
        return this.health;
    }

    private void setHealth(final Health health){
        this.health = health;
    }

    Hunger getHunger(final StatsFactory factory){
        return factory.createHungerStat();
    }

    public Hunger getHunger(){
        return this.hunger;
    }

    private void setHunger(final Hunger hunger){
        this.hunger = hunger;
    }

}
