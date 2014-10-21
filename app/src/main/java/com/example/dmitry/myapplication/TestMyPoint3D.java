package com.example.dmitry.myapplication;

/**
 * Created by Dmitry on 11.10.2014.
 */
public class TestMyPoint3D {
    public static void main (String[] args){
        MyPoint3D c1=new MyPoint3D();
        System.out.println(c1);
        System.out.println(c1.getX());
        System.out.println(c1.getY());
        System.out.println(c1.getZ());
        c1.setX(4);
        c1.setY(5);
        c1.setZ(6);
        System.out.println(c1);
    }
}
