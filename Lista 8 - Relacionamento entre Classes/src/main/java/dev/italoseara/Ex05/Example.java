package dev.italoseara.Ex05;

import dev.italoseara.other.Point;

public class Example {
    public static void main(String[] args) {
        Triangle right = new Triangle(
            new Point(0, 0),
            new Point(0, 3),
            new Point(4, 0)
        );

        System.out.println(right);
        System.out.println(right.isRight());
        System.out.println(right.isIsosceles());
        System.out.println(right.isEquilateral());

        System.out.println();

        Triangle isosceles = new Triangle(
            new Point(0, 0),
            new Point(0, 3),
            new Point(3, 0)
        );

        System.out.println(isosceles);
        System.out.println(isosceles.isRight());
        System.out.println(isosceles.isIsosceles());
        System.out.println(isosceles.isEquilateral());

        System.out.println();

        Triangle equilateral = new Triangle(
            new Point(0, 0),
            new Point(0, 3),
            new Point(Math.sqrt(6.75), 1.5)
        );

        System.out.println(equilateral);
        System.out.println(equilateral.isRight());
        System.out.println(equilateral.isIsosceles());
        System.out.println(equilateral.isEquilateral());
    }
}
