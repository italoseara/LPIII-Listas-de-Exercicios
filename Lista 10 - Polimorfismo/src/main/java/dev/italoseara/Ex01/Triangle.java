package dev.italoseara.Ex01;

import dev.italoseara.util.Point2D;

public class Triangle implements Shape2D {

    private Point2D a;
    private Point2D b;
    private Point2D c;

    public Triangle(double ax, double ay, double bx, double by, double cx, double cy) {
        this.a = new Point2D(ax, ay);
        this.b = new Point2D(bx, by);
        this.c = new Point2D(cx, cy);
    }

    public Triangle(Point2D a, Point2D b, Point2D c) {
        this(a.getX(), a.getY(), b.getX(), b.getY(), c.getX(), c.getY());
    }

    public Triangle() {
        this(new Point2D(), new Point2D(), new Point2D());
    }

    public Triangle(Triangle other) {
        this(other.a, other.b, other.c);
    }

    public Point2D getA() {
        return this.a;
    }

    public Point2D getB() {
        return this.b;
    }

    public Point2D getC() {
        return this.c;
    }

    public void setA(Point2D a) {
        this.a = a;
    }

    public void setA(double x, double y) {
        this.setA(new Point2D(x, y));
    }

    public void setB(Point2D b) {
        this.b = b;
    }

    public void setB(double x, double y) {
        this.setB(new Point2D(x, y));
    }

    public void setC(Point2D c) {
        this.c = c;
    }

    public void setC(double x, double y) {
        this.setC(new Point2D(x, y));
    }

    @Override
    public double area() {
        double sideAB = a.distanceTo(b);
        double sideBC = b.distanceTo(c);
        double sideCA = c.distanceTo(a);

        double s = (sideAB + sideBC + sideCA) / 2;

        return Math.sqrt(s * (s - sideAB) * (s - sideBC) * (s - sideCA));
    }

    @Override
    public double perimeter() {
        double sideAB = a.distanceTo(b);
        double sideBC = b.distanceTo(c);
        double sideCA = c.distanceTo(a);

        return sideAB + sideBC + sideCA;
    }

    @Override
    public String toString() {
        return null;
    }
}
