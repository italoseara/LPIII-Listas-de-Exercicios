package dev.italoseara.Ex04;

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

        System.out.println(point.distance(otherPoint)); // 5.0
        System.out.println(point.distance()); // 11.180339887498949
        System.out.println(point.distance(1, 1)); // 9.848857801796104
    }
}
