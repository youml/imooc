package com.imooc;

public class Initail {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Animal obj1 = new Animal();
        Animal obj2 = new Dog();
        Animal obj3 = new Cat();
        
        obj1.eat();
        
        obj2.eat();
        //obj2.watchDoor();不能这样调用
        
        obj3.eat();
    }

}
