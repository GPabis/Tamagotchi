package org.example.animalStatistics;

public interface StatsFactory {
    Entertainment createEntertainmentStat();
    Fatigue createFatigueStat();
    Health createHealthStat();
    Hunger createHungerStat();
}
