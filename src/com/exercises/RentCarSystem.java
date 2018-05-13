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
           //System.out.println("00000");
           return -1;
       }
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //现有可租车的信息
        Car[] cars = {
                new PassengerTrain("奥迪A4", 500, 4),
                new PassengerTrain("马自达6", 400, 4),
                new PickUp("皮卡雪6", 450, 4, 2),
                new PassengerTrain("金龙", 800, 20),
                new Truck("松花江", 400, 4),
                new Truck("依维柯", 1000, 20) 
        };
        
        RentCarSystem rentCarSystem = new RentCarSystem();
        int num = 0;
        while(true) {
            System.out.println("欢迎使用答答租车系统:");
            System.out.println("您是否要租车:1是 0否");
            num = rentCarSystem.input();
            if (num == 1) {
                break;
            }else if (num == 0) {
                System.exit(0);
            }else {
                System.out.println("请您输入数字1或者0!!!");
                continue;
            }
            
        }
        
        System.out.println("您可租车的类型及其价目表");
        System.out.println("序号   汽车名称  租金       容量");
        int index = 0;
        for (Car car:cars) {
            System.out.println(++index+".     "+car);
        }
        
        while(true) {
            System.out.println("请您输入您要租车的数量:");
            num = rentCarSystem.input();
            if (num >= 0) {
                break;
            }else {
                System.out.println("请您输入大于0的数字!!!");
                continue;
            }
            
        }
        //其实顾客的一些信息也可以单独写一个类,这里投机取巧了。
        //保存顾客要租的所有车辆信息
        Car[] rentCars = new Car[num];
        for(int i=0;i<num;i++) {
            while(true) {
                System.out.println("请输入第"+(i+1)+"辆车的序号:");
                int num1 = rentCarSystem.input();
                if (num1 >= 1 && num1 <= cars.length) {
                    rentCars[i] = cars[num1-1];
                    break;
                }else {
                    System.out.println("请您输入1到6之间的数字的数字!!!");
                    continue;
                }
                
            }
        }
        
        //租几天
        int days = 0;
        while(true) {
            System.out.println("请输入租车的天数:");
            days = rentCarSystem.input();
            if (days >=1) {
                break;
            }else {
                System.out.println("请您输入大于0的数字!!!");
                continue;
            }
        }
        
        System.out.println("您的账单:");
        System.out.println("***可载人的车有:");
        
        //客户租的车总共的载人量
        int busload = 0;
      //客户租的车总共的载货量
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
        System.out.println("共载人:"+busload+"人");
        System.out.println("***可载货的车有:");
        for (Car car : rentCars) {
            ITruck iTruck;
            if(car instanceof Truck || car instanceof PickUp)
            {
                iTruck = (ITruck)car;
                burden += iTruck.getBurden();
                System.out.print(car.getName()+"  ");
            }
        }
        System.out.println("共载货:"+burden+"货");
        
        //客户租车的总日租金
        int totalMoney = 0;
        for (Car car : rentCars) {
            totalMoney += car.getRent();
        }
        System.out.println(totalMoney*days);
    }

}
