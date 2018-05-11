package com.imooc;

public class Dog extends Animal {
    
    public void eat() {
        System.out.println("狗吃骨头");
        
    }
    
    //不能通过父类调用
    public void watchDoor() {
        System.out.println("狗可以看门");
    }
}
