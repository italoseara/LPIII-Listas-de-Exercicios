package dev.italoseara.Ex04.cone;

public class Example {
    public static void main(String[] args) {
        Cone c1 = new Cone(1, 2);
        Cone c2 = new Cone(3);
        Cone c3 = new Cone();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println(c1.getArea());
        System.out.println(c1.getVolume());
    }
}
