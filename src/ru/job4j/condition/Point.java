package ru.job4j.condition;

import static java.lang.Math.pow;

public class Point {
    private int x;
    private int y;

    public Point(int first, int second) {
        x = first;
        y = second;
    }

    public double distance(Point that) {
        return Math.sqrt(Math.pow(that.x - x, 2) + Math.pow(that.y - y, 2));
    }

    public static void main(String[] args) {
        Point point = new Point(3, 4);
        Point point1 = new Point(8, 9);
        point.distance(point1);
    }
}
