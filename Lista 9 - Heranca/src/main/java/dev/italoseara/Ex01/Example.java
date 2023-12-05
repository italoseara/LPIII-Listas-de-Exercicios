package dev.italoseara.Ex01;

public class Example {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(1, 2);
        Point2D p2 = new Point2D();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.distance(p2));
    }
}
