package com.example.dmitry.myapplication;

/**
 * Created by Dmitry on 05.10.2014.
 */
public class MyCircle {
    private MyPoint center;
    private double radius;

    public MyCircle(){
        center=new MyPoint();
        radius=1.0;
    }
    public MyCircle(int xCenter,int yCenter, double radius){
        center=new MyPoint(xCenter,yCenter);
        this.radius=radius;
    }
    public MyCircle(MyPoint center,double radius){
        this.center=center;
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }

    public MyPoint getCenter(){
        return center;
    }
    public void setCenter(MyPoint center){
        this.center=center;
    }
    public int getCenterX(){
        return center.getX();
    }
    public void setCenterX(int x){
        center.setX(x);
    }
    public int getCenterY(){
        return center.getY();
    }
    public void setCenterY(int y){
        center.setY(y);
    }
    public void setCenterXY(int x, int y){
        center.setX(x);
        center.setY(y);
    }
    public String toString(){
        return "center="+center+"radius="+radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return 2.0*Math.PI*radius;
    }
    public double distance(MyCircle another){
        return center.distance(another.center);
    }


}
