package dev.italoseara.Ex04.cylinder;

public class Example {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(1, 2);
        Cylinder c2 = new Cylinder(3);
        Cylinder c3 = new Cylinder();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println(c1.getArea());
        System.out.println(c1.getVolume());
    }
}
