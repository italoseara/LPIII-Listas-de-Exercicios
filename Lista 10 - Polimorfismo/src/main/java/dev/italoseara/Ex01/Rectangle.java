package dev.italoseara.Ex01;

import dev.italoseara.util.Point2D;

public class Rectangle implements Shape2D {

    private Point2D position;
    private double width;
    private double height;

    public Rectangle(double x, double y, double width, double height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Width and height must be positive");
        }

        this.position = new Point2D(x, y);
        this.width = width;
        this.height = height;
    }

    public Rectangle(Point2D position, double width, double height) {
        this(position.getX(), position.getY(), width, height);
    }

    public Rectangle(Rectangle other) {
        this(other.position, other.width, other.height);
    }

    public Rectangle() {
        this(0, 0, 1, 1);
    }

    public Point2D getPosition() {
        return this.position;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setPosition(double x, double y) {
        this.setPosition(new Point2D(x, y));
    }

    public void setPosition(Point2D position) {
        this.position = position;
    }

    public void setWidth(float width) {
        if (width < 0) {
            throw new IllegalArgumentException("Width must be positive");
        }

        this.width = width;
    }

    public void setHeight(float height) {
        if (height < 0) {
            throw new IllegalArgumentException("Height must be positive");
        }

        this.height = height;
    }

    @Override
    public double area() {
        return this.width * this.height;
    }

    @Override
    public double perimeter() {
        return 2 * (this.width + this.height);
    }

    @Override
    public String toString() {
        return String.format("Rectangle[position=%s,width=%.2f,height=%.2f]", this.position, this.width, this.height);
    }
}
