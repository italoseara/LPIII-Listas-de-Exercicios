package dev.italoseara.Ex04;

public class Example {
    public static void main(String[] args) {
        Point point = new Point();
        point.setX(5);
        point.setY(10);
        point.printPoint(); // (5, 10)

        System.out.println(point.isXAxis()); // false
        System.out.println(point.isYAxis()); // false
        System.out.println(point.isOrigin()); // false

        System.out.println(point.quadrant()); // 1

        Point otherPoint = new Point();
        otherPoint.setX(0);
        otherPoint.setY(10);
        otherPoint.printPoint(); // (0, 10)

        System.out.println(otherPoint.isYAxis()); // true
        System.out.println(otherPoint.isXAxis()); // false
        System.out.println(otherPoint.isOrigin()); // false

        System.out.println(point.distanceTo(otherPoint)); // 5.0
    }
}
