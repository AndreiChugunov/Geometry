package com.company;
import java.lang.Exception;
import com.company.Point;

public class Line {
    private double A,B,C;
   /* public Line(Line line) {
        this.A = line.A;
        this.B = line.B;
        this.C = line.C;
    }*/
    public Line(double A, double B, double C) throws Exception {
        this.A = A;
        this.B = B;
        this.C = C;
        if(A == B && A == 0)
            throw new Exception("Can't be such a line.");
    }
    public boolean isParallelOX() {
        return A == 0;
    }
    public boolean isParallelOY() {
        return B == 0;
    }
    public Point pointIntersection(Line line){
        double y = (((line.A * C) / A) - line.C) / (line.B - ((line.A * B) / A));
        double x = (-B * y - C) / A;
        return new Point(x, y);
    }
    public Line perpendicularLine(Point point) throws Exception {
        return new Line(A,-B,-point.getY() * A + B * point.getX());
    }
    public double getA() {
        return A;
    }
    public double getB() {
        return B;
    }
    public double getC() {
        return C;
    }
    public String toString()
    {
        return A + " x " + " + (" + B + "y)" + " + (" + C + ") = 0";
    }

}
