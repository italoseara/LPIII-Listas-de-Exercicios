package dev.italoseara.Ex04.cylinder;

import dev.italoseara.Ex04.Circle;

public class Cylinder {
    private double height;
    private Circle base;

    public Cylinder(double height, Circle base) {
        this.height = height;
        this.base = base;
    }

    public Cylinder(double height, double radius) {
        this.height = height;
        this.base = new Circle(radius);
    }

    public Cylinder(double height) {
        this.height = height;
        this.base = new Circle();
    }

    public Cylinder() {
        this.height = 1.0;
        this.base = new Circle();
    }

    public double getHeight() {
        return this.height;
    }

    public Circle getBase() {
        return this.base;
    }

    public float getArea() {
        return (float) (2 * Math.PI * this.base.getRadius() * this.height);
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBase(Circle base) {
        this.base = base;
    }

    public double getVolume() {
        return this.base.getArea() * this.height;
    }

    @Override
    public String toString() {
        return String.format("Cylinder[height=%.2f, base=%s]", this.height, this.base);
    }
}
