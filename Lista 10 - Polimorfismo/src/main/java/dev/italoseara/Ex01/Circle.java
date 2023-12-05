package dev.italoseara.Ex01;

import dev.italoseara.util.Point2D;

public class Circle implements Shape2D {

    private Point2D center;
    private double radius;

    public Circle(double x, double y, double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius must be positive");
        }

        this.center = new Point2D(x, y);
        this.radius = radius;
    }

    public Circle(Point2D center, double radius) {
        this(center.getX(), center.getY(), radius);
    }

    public Circle(Circle other) {
        this(other.center, other.radius);
    }

    public Circle() {
        this(0, 0, 1);
    }

    public Point2D getCenter() {
        return this.center;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setCenter(double x, double y) {
        this.setCenter(new Point2D(x, y));
    }

    public void setCenter(Point2D center) {
        this.center = center;
    }

    public void setRadius(float radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius must be positive");
        }

        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return String.format("Circle[center=%s,radius=%.2f]", this.center, this.radius);
    }
}
