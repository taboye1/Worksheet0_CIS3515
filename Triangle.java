/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aboye
 */
public class Triangle extends Shape {
    
    //The three side of triangle
    private double a;
    private double b;
    private double c;
    
 // create constructor to invoke the superclass 
    public Triangle(String name){
        super(name);   
    }
    
    //Set the method for setDimensions
    public void setDimensions(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double getArea(){
       double s = (a + b + c)*0.5;
       return Math.sqrt((s)*(s-a)* (s-b)*(s-c)); 
    }
        
    @Override
    public void printDimensions(){
       
       //Print side of the triangle
       System.out.println("The length of the side1 is:" + a);
       System.out.println("The length of the side2 is:" + b); 
       System.out.println("The length of the side3 is:" + c); 
    }
       
}
