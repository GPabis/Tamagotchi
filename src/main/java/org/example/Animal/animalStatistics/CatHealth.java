package org.example.Animal.animalStatistics;

public class CatHealth implements Health{
    private float healthPoints = 100;
    private static final float maxHealthPoints = 100;

    @Override
    public float getStat() {
        return this.healthPoints;
    }

    @Override
    public boolean isStatFull() {
        return healthPoints == this.maxHealthPoints;
    }

    @Override
    public boolean isStatLow() {
        return this.healthPoints <= this.maxHealthPoints/4;
    }

    @Override
    public boolean isStatZero() {
        return this.healthPoints == 0;
    }

    @Override
    public void takeMedicine(float healthPoint) {
        this.healthPoints = Math.min((this.healthPoints + healthPoint), this.maxHealthPoints);
    }

    @Override
    public void takeDamage(float dmg) {
        this.healthPoints -= Math.min(this.healthPoints, dmg);
    }
}
