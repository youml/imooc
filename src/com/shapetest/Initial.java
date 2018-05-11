package com.shapetest;

public class Initial {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Shape re = new Rectangle(3,4);
        System.out.println("面积为："+re.area());
        System.out.println("周长为："+re.perimeter());
        
        Shape ci = new Circle(5);
        System.out.println("面积为："+ci.area());
        System.out.println("周长为："+ci.perimeter());
  
    }

}
