package com.shapetest;

public class Initial {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Shape re = new Rectangle(3,4);
        System.out.println("���Ϊ��"+re.area());
        System.out.println("�ܳ�Ϊ��"+re.perimeter());
        
        Shape ci = new Circle(5);
        System.out.println("���Ϊ��"+ci.area());
        System.out.println("�ܳ�Ϊ��"+ci.perimeter());
  
    }

}
