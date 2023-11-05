package dev.italoseara.Ex05;

import dev.italoseara.Ex04.Point;

public class Circle {
    private float x;
    private float y;
    private float radius;

    public Circle(float x, float y, float radius) {
        if (!validateCircle(radius)) throw new IllegalArgumentException("Invalid circle");

        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle() {
        this(0, 0, 1);
    }

    public Circle(float radius) {
        this(0, 0, radius);
    }

    public Circle(float x, float y) {
        this(x, y, 1);
    }

    public boolean validateCircle(float radius) {
        return radius > 0;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public float getRadius() {
        return this.radius;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public void printCircle() {
        System.out.printf("Circle at (%.2f, %.2f) with radius %.2f\n", this.x, this.y, this.radius);
    }

    public boolean isInside(Point point) {
        return Math.sqrt(Math.pow(this.x - point.getX(), 2) + Math.pow(this.y - point.getY(), 2)) < this.radius;
    }

    public float area() {
        return (float) (Math.PI * Math.pow(this.radius, 2));
    }

    public float perimeter() {
        return (float) (2 * Math.PI * this.radius);
    }

    public boolean isBiggerThan(Circle other) {
        return this.area() > other.area();
    }
}
