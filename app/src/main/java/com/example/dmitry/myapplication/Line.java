package com.example.dmitry.myapplication;

/**
 * Created by Dmitry on 07.10.2014.
 */
public class Line {
    private MyPoint begin;
    private MyPoint end;

    public Line(int x1, int y1, int x2, int y2){
        begin= new MyPoint(x1,y1);
        end=new MyPoint(x2,y2);
    }
    public Line(MyPoint begin, MyPoint end ){
        this.begin=begin;
        this.end=end;

    }
    public MyPoint getBegin(){
        return begin;
    }
    public MyPoint getEnd(){
        return end;
    }
    public void setBegin(MyPoint begin){
        this.begin=begin;
    }
    public void setEnd(MyPoint end){
        this.end=end;
    }
    public int getBeginX(){
        return begin.getX();
    }
    public void setBeginX(int x){
        begin.setX(x);
    }
    public int getBeginY(){
        return begin.getY();
    }
    public void setBeginY(int y){
        begin.setY(y);
    }
    public void setBeginXY(int x, int y){
        begin.setX(x);
        begin.setY(y);
    }
    public int getEndX(){
        return end.getX();
    }
    public void setEndX(int x){
        end.setX(x);
    }
    public int getEndY(){
        return end.getY();
    }
    public void setEndY(int y){
        end.setY(y);
    }
    public void setEndXY(int x,int y){
        end.setX(x);
        end.setY(y);
    }
    public String toString(){
        return "Line from" + begin +"to" + end;
    }
    public double getLength(){
        int xDiff=begin.getX()-end.getX();
        int yDiff=begin.getY()-end.getY();
        return Math.sqrt(xDiff*xDiff-yDiff*yDiff);
    }
}
