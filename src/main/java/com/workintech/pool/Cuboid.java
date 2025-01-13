package com.workintech.pool;

public class Cuboid extends Rectangle{
   private  double height;

    public Cuboid(int width, int length, int height) {
        super(width, length);
        this.height = height <0? 0: height;
        // Math.max(height,0);
    }

    public  double getHeight(){
        return  height;
    }

    public  double getVolume(){
        return super.getArea() * this.getHeight();
    }
}
