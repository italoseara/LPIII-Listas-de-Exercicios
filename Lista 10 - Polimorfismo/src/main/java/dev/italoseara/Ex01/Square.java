package dev.italoseara.Ex01;

import dev.italoseara.util.Point2D;

public class Square implements Shape2D {

    private Point2D position;
    private double side;

    public Square(double x, double y, double side) {
        if (side < 0) {
            throw new IllegalArgumentException("Side must be positive");
        }

        this.position = new Point2D(x, y);
        this.side = side;
    }

    public Square(Point2D position, double side) {
        this(position.getX(), position.getY(), side);
    }

    public Square(Square other) {
        this(other.position, other.side);
    }

    public Square() {
        this(0, 0, 1);
    }

    public Point2D getPosition() {
        return this.position;
    }

    public double getSide() {
        return this.side;
    }

    public void setPosition(double x, double y) {
        this.setPosition(new Point2D(x, y));
    }

    public void setPosition(Point2D position) {
        this.position = position;
    }

    public void setSide(double side) {
        if (side < 0) {
            throw new IllegalArgumentException("Side must be positive");
        }

        this.side = side;
    }

    @Override
    public double area() {
        return this.side * this.side;
    }

    @Override
    public double perimeter() {
        return 4 * this.side;
    }

    @Override
    public String toString() {
        return String.format("Square[position=%s,side=%.2f]", this.position, this.side);
    }
}
