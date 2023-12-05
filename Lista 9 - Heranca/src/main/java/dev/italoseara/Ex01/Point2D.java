package dev.italoseara.Ex01;

public class Point2D {
    private float x;
    private float y;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
        this(0, 0);
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    @Override
    public String toString() {
        return String.format("(%f, %f)", this.x, this.y);
    }

    public boolean inAxisX() {
        return this.y == 0;
    }

    public boolean inAxisY() {
        return this.x == 0;
    }

    public boolean inAxis() {
        return this.inAxisX() || this.inAxisY();
    }

    public boolean inOrigin() {
        return this.inAxisX() && this.inAxisY();
    }

    public float distance(Point2D other) {
        float xDiff = this.x - other.x;
        float yDiff = this.y - other.y;
        return (float) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
}
