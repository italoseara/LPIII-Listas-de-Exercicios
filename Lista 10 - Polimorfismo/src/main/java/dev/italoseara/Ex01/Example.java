package dev.italoseara.Ex01;

public class Example {
    public static void main(String[] args) {
        Shape2D[] shapes = new Shape2D[8];

        shapes[0] = new Circle(1, 2, 3);
        shapes[1] = new Circle(4, 5, 6);
        shapes[2] = new Rectangle(1, 2, 3, 4);
        shapes[3] = new Rectangle(5, 6, 7, 8);
        shapes[4] = new Triangle(1, 2, 3, 4, 5, 6);
        shapes[5] = new Triangle(7, 8, 9, 10, 11, 12);
        shapes[6] = new Square(1, 2, 3);
        shapes[7] = new Square(4, 5, 6);

        for (Shape2D shape : shapes) {
            System.out.println(shape);
            System.out.println("Area: " + shape.area());
            System.out.println("Perimeter: " + shape.perimeter());
            System.out.println();
        }
    }
}
