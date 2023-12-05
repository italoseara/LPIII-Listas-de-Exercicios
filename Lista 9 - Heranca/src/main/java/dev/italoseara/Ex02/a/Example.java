package dev.italoseara.Ex02.a;

public class Example {
    public static void main(String[] args) {
        Point3D p1 = new Point3D(1, 2, 3);
        Point3D p2 = new Point3D();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.distance(p2));
    }
}
