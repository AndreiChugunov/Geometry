package com.company;


public class Line {
    private double A,B,C;

    public Line(double A1,double B1,double C1) {
        A=A1;
        B=B1;
        C=C1;
    }
    public void isparallel() {
      if (A == 0)
        System.out.println("Your line is lying in a parallel with OX");
      else
        if (B == 0)
          System.out.println("Your line is lying in a parallel with OY");
        else
            System.out.println("Your line is not parralel to OX or OY");
    }
    public void pointofintersection(Line line){
        double y;
        y=(((line.A * C) / A) - line.C) / (line.B - ((line.A * B) / A));
        System.out.println("Two lines cross in point:");
        System.out.println("x=" + (-B * y - C) / A);
        System.out.println("y=" + y);
    }
    public void somenewline(double x1,double y1) {
        Line l1=new Line(A,-B,-y1*A-B*x1);
        double C1=-y1*A-B*x1;
        System.out.println("Line that is perpendicular to your line and goes through your point is:");
        System.out.println(A + "x+(" + -B + "y)+(" + C1 + ")=0");
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


}
