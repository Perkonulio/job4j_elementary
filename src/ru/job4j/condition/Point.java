package ru.job4j.condition;

import static java.lang.Math.pow;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance3D(Point that) {
        return Math.sqrt(Math.pow(that.x - x, 2) + Math.pow(that.y - y, 2) + Math.pow(that.z - z, 2));
    }

    public double distance(Point that) {
        return Math.sqrt(Math.pow(that.x - x, 2) + Math.pow(that.y - y, 2));
    }

    public static void main(String[] args) {
        Point point = new Point(3, 4);
        Point point1 = new Point(8, 9, 10);
        System.out.println(point.distance(point1));
    }
}
