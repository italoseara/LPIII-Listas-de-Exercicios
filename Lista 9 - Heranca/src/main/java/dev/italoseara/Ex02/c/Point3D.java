package dev.italoseara.Ex02.c;

import dev.italoseara.Ex01.Point2D;

public class Point3D extends Point2D {
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
        this(0, 0, 0);
    }

    public double getZ() {
        return this.z;
    }

    @Override
    public String toString() {
        return "(" + super.getX() + ", " + super.getY() + ", " + this.z + ")";
    }

    public double distance(Point3D point3D) {
        double xDiff = super.getX() - point3D.getX();
        double yDiff = super.getY() - point3D.getY();
        double zDiff = this.z - point3D.getZ();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff + zDiff * zDiff);
    }
}
