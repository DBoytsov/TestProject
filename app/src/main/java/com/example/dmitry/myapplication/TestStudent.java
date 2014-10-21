package com.example.dmitry.myapplication;

/**
 * Created by Dmitry on 05.10.2014.
 */
public class TestStudent {
    public static void main (String[] args){
        Student ahTeck=new Student("DmitryBoytsov","1 Happy Ave");
        ahTeck.addCourseGrade("IM101",89);
        ahTeck.addCourseGrade("IM102",99);
        ahTeck.addCourseGrade("IM103",55);
        ahTeck.printGrades();
        System.out.printf("The average grade is %.2f:",ahTeck.getAverageGrade());
    }
}
