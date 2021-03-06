package com.company;
import com.company.Line;
import com.company.Point;

public class Section {
    private Point point1, point2;
   /* public Section(Section section) {
        this.point1 = section.point1;
        this.point2 = section.point2;
    }
    public Section(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
   }*/
    public Section(double x1, double y1, double x2, double y2){
        point1=new Point(x1, y1);
        point2=new Point(x2, y2);
    }
    public boolean isCrossing(Line line){
        return ((line.getA() * point1.getX() + line.getB() * point1.getY() + line.getC()) *
                (line.getA() * point2.getX() + line.getB() * point2.getY() + line.getC())) < 0;
    }
    @Override
    public String toString() {
        return "(" + point1.toString() + "; " + point2.toString() + ")";
    }
}
