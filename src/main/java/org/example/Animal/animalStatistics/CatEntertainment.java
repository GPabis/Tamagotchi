package org.example.Animal.animalStatistics;

public class CatEntertainment implements Entertainment {
    private float entertainmentPoints = 100;
    private static final float maxEntertainmentPoints = 100;

    @Override
    public void play(float funPoints) {
        this.entertainmentPoints = Math.min((this.entertainmentPoints + funPoints), maxEntertainmentPoints);
    }

    @Override
    public void becomeBored(float entertainmentPoints) {
        this.entertainmentPoints -= Math.min(this.entertainmentPoints, entertainmentPoints);
    }

    @Override
    public float getStat() {
        return this.entertainmentPoints;
    }

    @Override
    public boolean isStatFull() {
        return this.entertainmentPoints == maxEntertainmentPoints;
    }

    @Override
    public boolean isStatLow() {
        return this.entertainmentPoints <= maxEntertainmentPoints/4;
    }

    @Override
    public boolean isStatZero() {
        return this.entertainmentPoints == 0;
    }
}
