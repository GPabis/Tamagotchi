package org.example.animalStatistics;

public interface Health {
    void takeMedicine(float healthPoint);
    void takeDamage(float dmg);
    float getStat();
    boolean isStatFull();
    boolean isStatLow();
    boolean isStatZero();
}
