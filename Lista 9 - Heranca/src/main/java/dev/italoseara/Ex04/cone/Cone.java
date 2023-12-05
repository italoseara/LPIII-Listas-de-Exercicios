package dev.italoseara.Ex04.cone;

import dev.italoseara.Ex04.Circle;

public class Cone {
    private Circle base;
    private double height;

    public Cone(Circle base, double height) {
        this.base = base;
        this.height = height;
    }

    public Cone(double radius, double height) {
        this.base = new Circle(radius);
        this.height = height;
    }

    public Cone(double height) {
        this.base = new Circle();
        this.height = height;
    }

    public Cone() {
        this.base = new Circle();
        this.height = 1.0;
    }

    public Circle getBase() {
        return this.base;
    }

    public double getHeight() {
        return this.height;
    }

    public void setBase(Circle base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return this.base.getArea() * this.height / 3;
    }

    public double getArea() {
        return Math.PI * this.base.getRadius() * (this.base.getRadius() + Math.sqrt(Math.pow(this.height, 2) + Math.pow(this.base.getRadius(), 2)));
    }

    @Override
    public String toString() {
        return String.format("Cone[base=%s, height=%.2f]", this.base, this.height);
    }
}
