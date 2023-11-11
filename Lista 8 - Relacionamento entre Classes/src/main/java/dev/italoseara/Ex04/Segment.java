package dev.italoseara.Ex04;

import dev.italoseara.other.Point;

public class Segment {
    private Point point1;
    private Point point2;

    Segment(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public String toString() {
        return "(" + this.point1 + ", " + this.point2 + ")";
    }

    public double getDimention() {
        return Point.distance(this.point1, this.point2);
    }
}
