package com.example.dmitry.myapplication;

/**
 * Created by Dmitry on 07.10.2014.
 */
public class TestLine {
    public static void main (String[] args){
        Line l1=new Line(0,3,4,0);
        System.out.println(l1);
        System.out.println(l1.getLength());
        l1.setBeginXY(1,2);
        l1.setEndXY(3,4);
        System.out.println(l1);

        MyPoint p1=new MyPoint(3,0);
        MyPoint p2=new MyPoint(0,4);
        Line l2=new Line(p1,p2);
        System.out.println(l2);
        System.out.println(l2.getLength());
        l2.setBegin(new MyPoint(5,6));
        l2.setEnd(new MyPoint(7,8));
        System.out.println(l2);
        System.out.println(l2.getLength());
    }
}
