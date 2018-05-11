package com.shapetest;



public class Rectangle extends Shape {
    double height;
    double width;
    
    public Rectangle() {
        // TODO Auto-generated constructor stub
        height = 2.0;
        width = 1.0;
    }
   public Rectangle(double height, double width) {
       this.height = height;
       this.width = width;
   }
    
    @Override
    public double area() {
        // TODO Auto-generated method stub
        return height*width;
    }

    @Override
    public double perimeter() {
        // TODO Auto-generated method stub
        return (height+width)*2;
    }

}
