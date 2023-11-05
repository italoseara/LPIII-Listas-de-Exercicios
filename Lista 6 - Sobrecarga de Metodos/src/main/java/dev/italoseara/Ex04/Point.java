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

    public int quadrant() {
        if (this.isOrigin()) return 0;
        if (this.isXAxis()) return 1;
        if (this.isYAxis()) return 2;

        if (this.x > 0) return this.y > 0 ? 1 : 4;
        return this.y > 0 ? 2 : 3;
    }

    public double distance(Point other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }

    public double distance(int x, int y) {
        return this.distance(new Point(x, y));
    }

    public double distance() {
        return this.distance(0, 0);
    }
}
