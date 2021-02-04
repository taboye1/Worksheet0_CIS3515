/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aboye
 */
public class EquilateralTriangle extends Triangle {
    public double side;
    
    public EquilateralTriangle(String name){      
        super(name);//name of equilateralTirangle
    }
    
    //set side of EquilateralTriangle
     public void setDimensions(double side){
        this.side = side;
        //set all side with the same value
        super.setDimensions(side, side, side);            
    }
    
    // get 
    @Override
    public double getArea(){
        double S = (side + side + side)*0.5;
        return Math.sqrt((S)*(S-side)* (S-side)*(S-side));
    }
    
    //print
    @Override
    public void printDimensions(){
       System.out.println("The length of the side1 is:" + side); 
    }
    
}
