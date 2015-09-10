
package com.company;
import com.company.Line;
import com.company.Section;


public class Main {

    public static void main(String[] args) {
        Line l=new Line(2,3,5);
        l.isparallel();
        Line l1=new Line(1,1,0);
        l.pointofintersection(l1);
        l1.somenewline(0, 0);
        Section section=new Section(0,2,2,0);
        section.iscrossing(l1);


    }

}
