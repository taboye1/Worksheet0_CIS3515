/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
  * @author Aboye
 */
public class Circle extends Shape{
    
    private double radius;
    
    // Constructor invokes of its superclass
    public Circle(String name){
        super(name);
  
    }
    //A method for setDimensions of circle
    public void setDimensions(double radius){
        this.radius = radius;
    }
    
    @Override
    public double getArea(){
        return 3.14 * radius * radius;//return area of circle
    }
    
   
    @Override
    public void printDimensions(){
        
        //print the value of radius
        System.out.println("radius is:" + radius);
    }
    
}
