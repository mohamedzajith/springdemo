package org.mohamed.examples;

import java.util.List;

/**
 * Created by dba on 10/13/15.
 */
public class Triangle {

    private List<Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public void draw(){
        for (Point  point : points){
            System.out.println("Point = ( "+ point.getX() + " , " + point.getY() + " ) ");
        }
    }
}
