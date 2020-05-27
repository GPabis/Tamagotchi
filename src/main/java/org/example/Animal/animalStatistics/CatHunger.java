package org.example.Animal.animalStatistics;

public class CatHunger implements Hunger{
    private float hungerPoints = 80;
    private static final float maxHungerPoints = 80;
    @Override
    public void eatFood(float foodPoint) {
        this.hungerPoints = Math.min((hungerPoints + foodPoint), maxHungerPoints);
    }

    @Override
    public void starve(float hungerPoint) {
        this.hungerPoints -= Math.min(this.hungerPoints, hungerPoint);
    }

    @Override
    public float getStat() {
        return this.hungerPoints;
    }

    @Override
    public boolean isStatFull() {
        return this.hungerPoints == maxHungerPoints;
    }

    @Override
    public boolean isStatLow() {
        return this.hungerPoints <= maxHungerPoints/4;
    }

    @Override
    public boolean isStatZero() {
        return this.hungerPoints == 0;
    }
}
