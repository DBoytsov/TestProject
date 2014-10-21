package com.example.dmitry.myapplication;

/**
 * Created by Dmitry on 05.10.2014.
 */
public class Student {
    private String name,address;
    private Integer numCourse;
    private String[] courses;
    private int[] grades;
    private static final int MAX_COURSE=30;

    public Student(String name,String address){
        this.name=name;
        this.address=address;
        courses = new String[MAX_COURSE];
        grades= new int[MAX_COURSE];
        numCourse=0;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String toString(){
        return name+ "("+address+")";
    }
    public void addCourseGrade(String course,int grade){
        courses[numCourse]=course;
        grades[numCourse]=grade;
        ++numCourse;
    }

    public void printGrades(){
        System.out.print(this);
        for (int i=0;i<numCourse;++i){
            System.out.print(" "+courses[i]+":"+grades[i]);
        }
        System.out.println();
    }
    public double getAverageGrade(){
        int sum=0;
        for (int i=0;i<numCourse;++i){
            sum+=grades[i];
        }
        return (double)sum/numCourse;
    }
}
