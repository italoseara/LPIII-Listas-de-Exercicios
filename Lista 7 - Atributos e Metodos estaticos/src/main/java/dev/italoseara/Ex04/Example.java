package dev.italoseara.Ex04;

public class Example {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 5);

        System.out.println(Point.distance(p1, p2)); // 3.605551275463989
        System.out.println(Point.distance(p1)); // 2.23606797749979
        System.out.println(Point.quadrant(p1)); // 1
    }
}
