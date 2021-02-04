/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Aboye
 */
public class Main {
    
    // main method starts here
    public static void main(String args[]){
    
        //Create scanner to prompt the user to enter their data   
        Scanner input= new Scanner(System.in);
        
    
    //*************** Square **************************//    
        //Create one instance for Square and dimensions
        System.out.println("Enter length and height :");
        Square square = new Square("Square");
        double length = input.nextDouble();
        double height = input.nextDouble();
        square.setDimensions(length,height);
        
        //print all information for Square
        System.out.println("The Name of the object is:"+square.getName());
        square.printDimensions();
        System.out.println("Area of Square is :" + square.getArea());
        
    //*************** Square **************************// 
    
    
        
    //*************** Circle **************************//   
        //Create one instance for Circle and dimensions
        System.out.println("Enter radius for Circle :");
        Circle circle = new Circle("Circle");
        double radius = input.nextDouble();
        circle.setDimensions(radius);
        
        // Print all information for circle
        System.out.println("The Name of the object is:"+ circle.getName());
        circle.printDimensions();
        System.out.println("Area of Circle is : " + circle.getArea());
        
    //*************** Circle **************************//
    
    
        
    //*************** Triangle **************************//
    
        //Create one instance for Triangle and dimensions 
        System.out.println("Enter the three sides of Triangle:");
        Triangle triangle = new Triangle("Triangle");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        triangle.setDimensions(a,b,c);
        
        // Print all information for Triangle
        System.out.println("The Name of the object is:"+ triangle.getName());
        triangle.printDimensions();
        System.out.println("Area of triangle is : "+ triangle.getArea());
        
    //*************** Triangle **************************//
    
    
        
   //*************** EquilateralTriangle **************************// 
   
        //Create one instance for EquilateralTriangle and dimensions
        System.out.println("Please enter EquilateralTriangle :");
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle("EquilateralTriangle");
        double side = input.nextDouble();
        equilateralTriangle.setDimensions(side);
        
        // Print all information for EquilateralTriangle   
        System.out.println("The Name of the object is:"+ equilateralTriangle.getName());
        equilateralTriangle.printDimensions();
        System.out.println("Area of EquilateralTriangle is : "+equilateralTriangle.getArea());
    
    //*************** EquilateralTriangle **************************// 
    
    
    }
          
    
}
