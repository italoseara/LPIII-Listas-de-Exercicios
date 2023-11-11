package dev.italoseara.Ex05;

import dev.italoseara.other.Point;

public class Triangle {
    Point point1;
    Point point2;
    Point point3;

    Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public String toString() {
        return "(" + this.point1 + ", " + this.point2 + ", " + this.point3 + ")";
    }

    public boolean isRight() {
        double a = Point.distance(this.point1, this.point2);
        double b = Point.distance(this.point2, this.point3);
        double c = Point.distance(this.point3, this.point1);

        return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) ||
                Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2) ||
                Math.pow(c, 2) + Math.pow(a, 2) == Math.pow(b, 2);
    }

    public boolean isIsosceles() {
        double a = Point.distance(this.point1, this.point2);
        double b = Point.distance(this.point2, this.point3);
        double c = Point.distance(this.point3, this.point1);

        return a == b || b == c || c == a;
    }

    public boolean isEquilateral() {
        double a = Point.distance(this.point1, this.point2);
        double b = Point.distance(this.point2, this.point3);
        double c = Point.distance(this.point3, this.point1);

        return a == b && b == c;
    }
}
