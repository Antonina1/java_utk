package ru.stqa.utk.sandbox;

/**
 * Created by Tonya on 11.06.2017.
 */
public class Point {

    double x;
    double y;

    public Point (double x, double y){
        this.x=x;
        this.y=y;
    }

    public static double distance(Point p1, Point p2){
        double distance = Math.sqrt((p2.x - p1.x)* (p2.x - p1.x)  + (p2.y - p1.y)* (p2.y - p1.y));
        return distance;
    }
}
