package ru.job4j.condition;

import static java.lang.Math.pow;

public class Point {
    public double distance(int x1,int y1,int x2,int y2){
        double bracket1 = Math.pow(x2-x1,2);
        double bracket2 = Math.pow(y2-y1,2);
        return Math.sqrt(bracket1 + bracket2);
    }

    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point.distance(1,1,5,8));
    }
}
