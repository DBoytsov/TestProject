package com.example.dmitry.myapplication;

/**
 * Created by Dmitry on 12.10.2014.
 */
public class LineSub extends MyPoint {
    private MyPoint end;

    public LineSub(int x1, int y1, int x2, int y2){
        super(x1,y1);
        end=new MyPoint(x2,y2);
    }
    public LineSub(MyPoint begin,MyPoint end){
        super(begin.getX(),end.getY());
        this.end=end;
    }

    public MyPoint getBegin(){
        return this;
    }
    public MyPoint getEnd(){
        return end;
    }
    public void setBegin(MyPoint begin){
        super.setX(begin.getX());
        super.setY(begin.getY());
    }
    public void setEnd(MyPoint end){
        this.end=end;
    }
    public int getBeginX(){
        return super.getX();
    }
    public void setBeginX(int x){
        super.setX(x);
    }
    public int getBeginY(){
        return super.getY();
    }

    public void setBeginY(int y){
        super.setY(y);
    }
    public void setBeginXY(int x, int y){
        super.setX(x);
        super.setY(y);
    }
    public int getEndX(){
        return super.getX();
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
    public void setEndXY(int x, int y){
        end.setX(x);
        end.setY(y);
    }
    public String toString(){
        return "Line from"+super.toString()+"to"+end;
    }
    public double getLength(){
        int xDiff=super.getX()-end.getX();
        int yDiff=super.getY()-end.getY();
        return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
    }
}
