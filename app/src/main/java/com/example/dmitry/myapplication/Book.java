package com.example.dmitry.myapplication;

import org.apache.http.auth.AUTH;

/**
 * Created by Dmitry on 01.10.2014.
 */
public class Book {
    private String name;
    private Author[] author;
    private double price;
    private int qtyInStock;
    private int numCourse;

    public Book(String name,Author[] author,double price){
    this.name=name;
    this.author=author;
    this.price=price;
    numCourse=0;
    }
    public Book(String name,Author[] author,double price,int qtyInStock){
        this.name=name;
        this.author=author;
        this.price=price;
        this.qtyInStock=qtyInStock;
        numCourse=0;
    }
    public String getName(){
        return name;
    }
    public Author[] getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public  void setPrice(Double price){
        this.price=price;

    }
    public int getQtyInStock(){
        return qtyInStock;
    }
    public void setQtyInStock(int qtyInStock1){
        this.qtyInStock=qtyInStock1;
    }
    public String toString(){
        return this.name+" by "+ this.author.toString();
    }
    public void printAuthors() {
         System.out.print(author);
    }
}
