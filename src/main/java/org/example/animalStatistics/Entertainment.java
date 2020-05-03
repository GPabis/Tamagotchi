package org.example.animalStatistics;

public interface Entertainment {
    void play(float funPoints);
    void becomeBored(float entertainmentPoints);
    float getStat();
    boolean isStatFull();
    boolean isStatLow();
    boolean isStatZero();
}
