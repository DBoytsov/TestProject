package com.example.dmitry.myapplication;

/**
 * Created by Dmitry on 01.10.2014.
 */
public class TestCircle{
    public static void main (String[] args){
      /**  Circle c1=new Circle();
        System.out.println("The circle has radius of"+c1.getRadius()+"and area of"+c1.getArea());
        Circle c2=new Circle(2.0);
        System.out.println("The circle has radius of"+c2.getRadius()+"and area of"+c2.getArea());
        System.out.println(c2.getColor());
        Circle c3=new Circle(3.3,"brown");
        System.out.println(c3.getColor()+""+c3.getRadius());
        c3.setRadius(10.1);
        c3.setColor("green");
        System.out.println(c3.getRadius()+" "+c3.getColor());
        System.out.print(c3.toString()); **/
        Author[] authors=new Author[3];
        authors[0] = new Author("Ann","ann@nn.ru",'f');
        authors[1]= new Author("Dmitry","ddd@bb.ru",'m');
        authors[2]=new Author("Boris","sss@hh,ry",'f');
        for (int i=0;i<3;++i){
            System.out.println(authors[i]);
        }

        /**anAuthor.setEmail("123123@bk.ru");
        System.out.println(anAuthor);
        System.out.println(anAuthor.getEmail());
        **/
        Book aBook = new Book("Java for me",authors,19.95,1000);
        System.out.println(aBook.toString());
    }
}
