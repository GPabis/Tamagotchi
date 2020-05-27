package org.example.Animal.animalStatistics;

public class CatStatsFactory implements StatsFactory {

    @Override
    public Entertainment createEntertainmentStat() { return new CatEntertainment(); }

    @Override
    public Fatigue createFatigueStat() {
        return new CatFatigue();
    }

    @Override
    public Health createHealthStat() {
        return new CatHealth();
    }

    @Override
    public Hunger createHungerStat() {
        return new CatHunger();
    }
}
