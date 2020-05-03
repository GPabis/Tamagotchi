package org.example.animalStatistics;

public interface Fatigue {
    void sleep(float sleepPoint);
    void becomeSleepy(float fatiguePoints);
    float getStat();
    boolean isStatFull();
    boolean isStatLow();
    boolean isStatZero();
}
