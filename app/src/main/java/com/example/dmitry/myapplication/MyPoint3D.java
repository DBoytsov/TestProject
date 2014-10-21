package com.example.dmitry.myapplication;

/**
 * Created by Dmitry on 11.10.2014.
 */
public class MyPoint3D extends MyPoint {
    private int z;

    public MyPoint3D(){
        super();
        z=0;
    }
    public MyPoint3D(int x, int y, int z){
        super(x,y);
        this.z=z;
    }
    public int getZ(){
        return z;
    }
    public void setZ(int z){
        this.z=z;
    }

    @Override
    public String toString(){
        return "("+super.getX()+","+super.getY()+","+z+")";
    }
}
