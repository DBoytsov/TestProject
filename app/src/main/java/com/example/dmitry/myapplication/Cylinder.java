package com.example.dmitry.myapplication;

/**
 * Created by Dmitry on 07.10.2014.
 */
public class Cylinder extends MyCircle{
    private double height;

    public Cylinder(){
        super();
        height=5.0;
    }
    public Cylinder(int xCenter,int yCenter, double radius,double height){
        super(xCenter,yCenter,radius);
        this.height=height;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getVolume(){
        return super.getArea()*height;
    }

    @Override
    public double getArea(){
        return 2*Math.PI*getRadius()*height+2*super.getArea();
    }
    @Override
    public String toString(){
        return "Cylinder:radius="+getArea()+"height"+height;
    }
}
