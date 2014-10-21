package com.example.dmitry.myapplication;

/**
 * Created by Dmitry on 12.10.2014.
 */
public class TestSubLine {
    public static void main (String[] args){
        LineSub s1=new LineSub(0,3,4,5);
        System.out.println(s1);
        System.out.println(s1.getLength());
        s1.setBeginXY(1,2);
        s1.setEndXY(3,4);
        System.out.println(s1);

        MyPoint p1=new MyPoint(3,0);
        MyPoint p2=new MyPoint(0,4);
        LineSub s2=new LineSub(p1,p2);
        System.out.println(s2);
    }
}
