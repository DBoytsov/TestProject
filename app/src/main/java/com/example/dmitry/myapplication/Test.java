package com.example.dmitry.myapplication;

/**
 * Created by Dmitry on 11.10.2014.
 */
public class Test {
    public static void main (String[] args){
        MyStudent s1=new MyStudent("Dmitry","Saratov");
        s1.addCourseGrade("IM101",97);
        s1.addCourseGrade("IM102",68);
        s1.printGrades();
        System.out.println("Average is "+s1.getAverage());

        MyTeacher t1=new MyTeacher("Ann","Moscow");
        System.out.println(t1);
        String[] courses= {"IM101","IM102","IM101"};
        for (String course: courses){
            if (t1.addCourse(course)){
                System.out.println(course +"added.");
            }else{
                System.out.println(course+" cannot be added.");
            }
        }
        if (t1.removeCourse("IM107")){
            System.out.println("will be removed");
        }else{
            System.out.println("Error");
        };

        /*for (String course:courses){
            if(t1.removeCourse(course)){
                System.out.println(course+"removed");
            }else{
                System.out.println(course+"cannot be removed");
            }
        }*/



    }
}
