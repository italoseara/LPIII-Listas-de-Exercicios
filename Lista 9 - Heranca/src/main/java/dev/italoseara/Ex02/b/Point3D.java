package dev.italoseara.Ex02.b;

import dev.italoseara.Ex01.Point2D;

public class Point3D {
    // Agregação de Point2D
    private Point2D point2D;
    private float z;

    public Point3D(Point2D point2D, float z) {
        this.point2D = point2D;
        this.z = z;
    }

    public Point3D() {
        this(new Point2D(), 0);
    }

    public float getX() {
        return this.point2D.getX();
    }

    public float getY() {
        return this.point2D.getY();
    }

    public float getZ() {
        return this.z;
    }

    @Override
    public String toString() {
        return String.format("(%f, %f, %f)", this.getX(), this.getY(), this.getZ());
    }

    public boolean inAxisX() {
        return this.point2D.inAxisX() && this.z == 0;
    }

    public boolean inAxisY() {
        return this.point2D.inAxisY() && this.z == 0;
    }

    public boolean inAxisZ() {
        return this.point2D.inOrigin() && this.z != 0;
    }

    public boolean inAxis() {
        return this.point2D.inAxis() || this.z == 0;
    }

    public boolean inOrigin() {
        return this.point2D.inOrigin() && this.z == 0;
    }

    public float distance(Point3D other) {
        float xDiff = this.getX() - other.getX();
        float yDiff = this.getY() - other.getY();
        float zDiff = this.getZ() - other.getZ();
        return (float) Math.sqrt(xDiff * xDiff + yDiff * yDiff + zDiff * zDiff);
    }
}
