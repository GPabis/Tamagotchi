package org.example.Animal.animalStatistics;

public interface Fatigue {
    void sleep(float sleepPoint);
    void becomeSleepy(float fatiguePoints);
    float getStat();
    boolean isStatFull();
    boolean isStatLow();
    boolean isStatZero();
}
