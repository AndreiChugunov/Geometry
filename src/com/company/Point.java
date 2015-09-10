package com.company;

public class Point {
    double x, y;
    Point(){
        x = 0;
        y = 0;
    }
    Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    Point(Point point){
        this.x = point.x;
        this.y = point.y;
    }
}
