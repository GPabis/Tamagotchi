package org.example.Animal.animalStatistics;

public interface StatsFactory {
    Entertainment createEntertainmentStat();
    Fatigue createFatigueStat();
    Health createHealthStat();
    Hunger createHungerStat();
}
