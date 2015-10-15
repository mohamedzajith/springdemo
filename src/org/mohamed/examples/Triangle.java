package org.mohamed.examples;

/**
 * Created by dba on 10/13/15.
 */
public class Triangle {
    private String type;
    private int high;

    public Triangle(String type){
        this.type = type;
    }

    public Triangle(int high){
        this.high = high;
    }

    public Triangle(String type , int high){
        this.high = high;
        this.type = type;
    }

    public int getHigh() {
        return high;
    }

    public String getType() {
        return type;
    }

//    public void setType(String type) {
//        this.type = type;
//    }

    public void draw(){
        System.out.println(getType() + " Triangle drawing " + getHigh());
    }
}
