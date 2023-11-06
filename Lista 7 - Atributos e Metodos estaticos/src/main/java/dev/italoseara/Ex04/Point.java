package dev.italoseara.Ex04;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0, 0);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void printPoint() {
        System.out.printf("(%d, %d)\n", this.x, this.y);
    }

    public boolean isXAxis() {
        return this.y == 0;
    }

    public boolean isYAxis() {
        return this.x == 0;
    }

    public boolean isOrigin() { // Equivalente a "isEixos()" pedido no exercício
        return this.x == 0 && this.y == 0;
    }

    public static int quadrant(Point p) {
        if (p.isOrigin()) return 0;
        if (p.isXAxis()) return 1;
        if (p.isYAxis()) return 2;

        if (p.x > 0) return p.y > 0 ? 1 : 4;
        return p.y > 0 ? 2 : 3;
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }

    public static double distance(Point p) {
        return distance(p, new Point());
    }
}
