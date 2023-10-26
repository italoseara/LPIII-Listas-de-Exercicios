package dev.italoseara.Ex05;

public class Example {
    public static void main(String[] args) {
        Point point = new Point(5, 10);
        point.printPoint(); // (5, 10)

        System.out.println(point.isXAxis()); // false
        System.out.println(point.isYAxis()); // false
        System.out.println(point.isOrigin()); // false

        System.out.println(point.quadrant()); // 1

        Point otherPoint = new Point(0, 10);
        otherPoint.printPoint(); // (0, 10)

        System.out.println(otherPoint.isYAxis()); // true
        System.out.println(otherPoint.isXAxis()); // false
        System.out.println(otherPoint.isOrigin()); // false

        System.out.println(point.distanceTo(otherPoint)); // 5.0
    }
}
