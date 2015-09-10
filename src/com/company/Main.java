
package com.company;
import com.company.Line;
import com.company.Section;


public class Main {

    public static void main(String[] args) {
        try {
            Line line1 = new Line(2, 3, 5);
            System.out.println(line1.toString() + " isParallelOX: " + line1.isParallelOX());
            System.out.println(line1.toString() + " isParallelOY: " + line1.isParallelOY());
            Line line2 = new Line(1, 1, 0);
            System.out.println(line1.pointIntersection(line2).toString());
            System.out.println(line2.perpendicularLine(new Point(0, 0)).toString());
            Section section = new Section(0, 2, 2, 0);
            System.out.println(section.toString() + " isCrossing: " + section.isCrossing(line2));
        }
        catch (IllegalArgumentException exp){
            System.out.print(exp.toString());
        }

    }

}
