package com.company;
import com.company.Line;
import com.company.Point;

public class Section {
    private Point point1, point2;
    private double x1,y1,x2,y2;
    public Section(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }
    public Section(){
        point1 = new Point();
        point2 = new Point();
    }
    public Section(double x1, double y1, double x2, double y2){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;

    }
    public void iscrossing(Line line){
        if(((line.getA()*x1+line.getB()*y1+line.getC())*(line.getA()*x1+line.getB()*y1+line.getC()))<0)
            System.out.println("Section and line are crossing themselves");
        else
            System.out.println("Section and line are not crossing themselves");

    }


}
