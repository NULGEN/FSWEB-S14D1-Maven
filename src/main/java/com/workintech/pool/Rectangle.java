package com.workintech.pool;

public class Rectangle {
    private double width;
    private double length;

    public  Rectangle(double width, double length){
        this.width = width<0? 0: width;
        this.length = length<0 ? 0 : length;
        // Math.max(width,0);
        // Math.max(length,0)
    }

    public  double getWidth(){
        return  width;
    }
    public  double getLength(){
        return  length;
    }
    public double getArea(){
        return  this.width * this.length;
    }
}
