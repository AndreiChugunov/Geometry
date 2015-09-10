package com.company;
import java.lang.IllegalArgumentException;
import com.company.Point;

public class Line {
    private double A,B,C;
   /* public Line(Line line) {
        this.A = line.A;
        this.B = line.B;
        this.C = line.C;
    }*/
    public Line(double A, double B, double C) throws IllegalArgumentException {
        this.A = A;
        this.B = B;
        this.C = C;
        if(A == B && A == 0)
            throw new IllegalArgumentException("Can't be such a line.");
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
    public Line perpendicularLine(Point point) throws IllegalArgumentException {
        return new Line(A, -B,-point.getX() * A + B * point.getY());
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
    @Override public String toString()
    {
        String kB = "",kC = "";
        if (B>=0 && C>=0) {
            kB = "x + ";
            kC = "y + ";
        }
        if (B<0 && C>=0) {
            kB="x ";
            kC="y + ";
        }
        if (B>=0 && C<0){
            kB="x + ";
            kC="y ";
        }
        return A + kB + B + kC + C + " = 0";
    }

}
