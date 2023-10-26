package dev.italoseara.Ex06;

import dev.italoseara.Ex05.Point;

public class Example {
    public static void main(String[] args) {
        Circle circle = new Circle(0, 0, 5);
        circle.printCircle(); // Circle at (0.00, 0.00) with radius 5.00

        Point point = new Point(3, 4);
        point.printPoint(); // (3, 4)

        System.out.println(circle.isInside(point)); // true
        System.out.println(circle.area()); // 78.53982
        System.out.println(circle.perimeter()); // 31.415928

        Circle otherCircle = new Circle(0, 0, 10);
        otherCircle.printCircle(); // Circle at (0.00, 0.00) with radius 10.00

        System.out.println(otherCircle.isInside(point)); // true
        otherCircle.setX(30);
        otherCircle.setY(4);
        otherCircle.printCircle(); // Circle at (30.00, 4.00) with radius 10.00
        System.out.println(otherCircle.isInside(point)); // false

        System.out.println(otherCircle.isBiggerThan(circle)); // true
    }
}
