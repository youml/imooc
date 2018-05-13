package com.exercises;

import java.util.Scanner;

public class RentCarSystem {
    Scanner in;
    public int input() {
         in = new Scanner(System.in);
        int num;
        try {
            num = in.nextInt();
            //in.close();
            return num;
       } catch (Exception e) {
           // TODO: handle exception
           System.out.println("00000");
           return -1;
       }
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //���п��⳵����Ϣ
        Car[] cars = {
                new PassengerTrain("�µ�A4", 500, 4),
                new PassengerTrain("���Դ�6", 400, 4),
                new PickUp("Ƥ��ѩ6", 450, 4, 2),
                new PassengerTrain("����", 800, 20),
                new Truck("�ɻ���", 400, 4),
                new Truck("��ά��", 1000, 20) 
        };
        
        RentCarSystem rentCarSystem = new RentCarSystem();
        int num = 0;
        while(true) {
            System.out.println("��ӭʹ�ô���⳵ϵͳ:");
            System.out.println("���Ƿ�Ҫ�⳵:1�� 0��");
            num = rentCarSystem.input();
            if (num == 1) {
                break;
            }else if (num == 0) {
                System.exit(0);
            }else {
                System.out.println("������������1����0!!!");
                continue;
            }
            
        }
        
        System.out.println("�����⳵�����ͼ����Ŀ��");
        System.out.println("���   ��������  ���       ����");
        int index = 0;
        for (Car car:cars) {
            System.out.println(++index+".     "+car);
        }
        
        while(true) {
            System.out.println("����������Ҫ�⳵������:");
            num = rentCarSystem.input();
            if (num >= 0) {
                break;
            }else {
                System.out.println("�����������0������!!!");
                continue;
            }
            
        }
        //��ʵ�˿͵�һЩ��ϢҲ���Ե���дһ����,����Ͷ��ȡ���ˡ�
        //����˿�Ҫ������г�����Ϣ
        Car[] rentCars = new Car[num];
        for(int i=0;i<num;i++) {
            while(true) {
                System.out.println("�������"+(i+1)+"���������:");
                int num1 = rentCarSystem.input();
                if (num1 >= 1 && num1 <= cars.length) {
                    rentCars[i] = cars[num1-1];
                    break;
                }else {
                    System.out.println("��������1��6֮������ֵ�����!!!");
                    continue;
                }
                
            }
        }
        
        //�⼸��
        int days = 0;
        while(true) {
            System.out.println("�������⳵������:");
            days = rentCarSystem.input();
            if (days >=1) {
                break;
            }else {
                System.out.println("�����������0������!!!");
                continue;
            }
        }
        
        System.out.println("�����˵�:");
        System.out.println("***�����˵ĳ���:");
        
        //�ͻ���ĳ��ܹ���������
        int busload = 0;
      //�ͻ���ĳ��ܹ����ػ���
        int burden = 0;
        for (Car car : rentCars) {
            ICarrier iCarrier;
            if(car instanceof PassengerTrain || car instanceof PickUp)
            {
                iCarrier = (ICarrier)car;
                busload += iCarrier.getBusload();
                System.out.print(car.getName()+"  ");
            }
        }
        System.out.println("������:"+busload+"��");
        System.out.println("***���ػ��ĳ���:");
        for (Car car : rentCars) {
            ITruck iTruck;
            if(car instanceof Truck || car instanceof PickUp)
            {
                iTruck = (ITruck)car;
                burden += iTruck.getBurden();
                System.out.print(car.getName()+"  ");
            }
        }
        System.out.println("���ػ�:"+burden+"��");
        
        //�ͻ��⳵���������
        int totalMoney = 0;
        for (Car car : rentCars) {
            totalMoney += car.getRent();
        }
        System.out.println(totalMoney*days);
    }

}
