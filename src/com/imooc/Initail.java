package com.imooc;

public class Initail {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /*
        Animal obj1 = new Animal();
        Animal obj2 = new Dog();
        Animal obj3 = new Cat();
        
        obj1.eat();
        
        obj2.eat();
        //obj2.watchDoor();不能这样调用
        
        obj3.eat();
        */
        Dog dog = new Dog();
        Animal animal = new Animal();//自动类型转换，向上转换
        
        if (animal instanceof Dog) {
            Dog dog2 = (Dog) animal;
        } else {
            System.out.println("无法进行类型转换1");
        }
           
        animal = dog;//此时的animal只能调用Animal中有的方法,属于Dog类独有的方法不能调用
        if (animal instanceof Dog) {
            Dog dog2 = (Dog) animal;
        } else {
            System.out.println("无法进行类型转换2");
        }
        
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;// 编译时Cat类型，运行时Dog类型
        } else {
            System.out.println("无法进行类型转换3");
        }
    }

}
