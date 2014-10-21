package com.example.dmitry.myapplication;

/**
 * Created by Dmitry on 11.10.2014.
 */
public class MyTeacher extends Person {
    private int numCourse;
    private String[] courses;
    private static final int MAX_COURSES=10;

    public MyTeacher(String name,String address){
        super(name,address);
        numCourse=0;
        courses=new String[MAX_COURSES];
    }

    @Override
    public String toString(){
        return "Teacher:"+super.toString();
    }

    public boolean addCourse(String course){
        for (int i=0;i<numCourse;i++){
            if (courses[i].equals(course)) return false;
        }
        courses[numCourse]=course;
        numCourse++;
        return true;
    }
    public boolean removeCourse(String course){
        int courseIndex=numCourse;
        for (int i=0;i<numCourse;i++){
            if (courses[i].equals(course)) {
                courseIndex=i;
                break;
            }
        }
        if (courseIndex==numCourse){
            return false;
        } else{
            for (int i=courseIndex;i<numCourse-1;i++){
                courses[i]=courses[i-1];
            }
            numCourse--;
            return true;
        }
    }
}
