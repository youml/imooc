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
        //obj2.watchDoor();������������
        
        obj3.eat();
        */
        Dog dog = new Dog();
        Animal animal = new Animal();//�Զ�����ת��������ת��
        
        if (animal instanceof Dog) {
            Dog dog2 = (Dog) animal;
        } else {
            System.out.println("�޷���������ת��1");
        }
           
        animal = dog;//��ʱ��animalֻ�ܵ���Animal���еķ���,����Dog����еķ������ܵ���
        if (animal instanceof Dog) {
            Dog dog2 = (Dog) animal;
        } else {
            System.out.println("�޷���������ת��2");
        }
        
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;// ����ʱCat���ͣ�����ʱDog����
        } else {
            System.out.println("�޷���������ת��3");
        }
    }

}
