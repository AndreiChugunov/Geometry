package com.company;

public class Point {
    private double x, y;
    public Point(){
        x = 0;
        y = 0;
    }
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Point(Point point){
        this.x = point.x;
        this.y = point.y;
    }
    public String toString() {
        return "(" + x + "; " + y + ")";
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void setX(double x){
        this.x=x;
    }
    public void setY(double y){
        this.y=y;
    }


}
