
package org.example.Animal.animalStatistics;

public interface Hunger {
    void eatFood(float foodPoint);
    void starve(float hungerPoint);
    float getStat();
    boolean isStatFull();
    boolean isStatLow();
    boolean isStatZero();
}
