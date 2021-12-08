package de.integrata.geometrie;

public class Kreis extends Punkt{

    private double radius;

    public Kreis() {
        this.radius = 0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() + ", Radius = " + getRadius();
    }
}
