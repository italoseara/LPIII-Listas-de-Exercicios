package dev.italoseara.Ex04;

import dev.italoseara.other.Point;

public class Example {
    public static void main(String[] args) {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(1, 1);
        Segment segment = new Segment(point1, point2);

        System.out.println(segment);
        System.out.println(segment.getDimention());
    }
}
