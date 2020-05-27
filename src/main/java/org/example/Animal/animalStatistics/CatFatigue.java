package org.example.Animal.animalStatistics;

public class CatFatigue implements Fatigue {
    private float fatiguePoints = 140;
    private static final float maxFatiguePoints = 140;
    @Override
    public void sleep(float sleepPoint) {
        this.fatiguePoints = Math.min((this.fatiguePoints + sleepPoint), maxFatiguePoints);
    }

    @Override
    public void becomeSleepy(float fatiguePoints) {
        this.fatiguePoints -= Math.min(this.fatiguePoints, fatiguePoints);
    }

    @Override
    public float getStat() {
        return this.fatiguePoints;
    }

    @Override
    public boolean isStatFull() {
        return this.fatiguePoints == maxFatiguePoints;
    }

    @Override
    public boolean isStatLow() {
        return this.fatiguePoints <= maxFatiguePoints/4;
    }

    @Override
    public boolean isStatZero() {
        return this.fatiguePoints == 0;
    }
}
