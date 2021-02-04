/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
* @author Aboye
 */
public class Square extends Shape {
    private double length;
    private double height;
    
    // Constructor
    public Square(String name){
        super(name);
    }
    
    //method for setDimensions
     public void setDimensions(double length,double height){
        this.length = length;
        this.height = height;
    }
     
    @Override
    public double getArea(){
        return length * height;//to calculate area of square and return
    }
      
    @Override
    public void printDimensions(){
       //print the length and height of the square 
        System.out.println("The length of squre is:"+length);
        System.out.println("The height of squre is:"+height);
    }                     
}
