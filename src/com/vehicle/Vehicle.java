package com.vehicle;

public class Vehicle {
    public String name;
    public int busload;
    public String property;
    public int speed;
    
    public Vehicle() {
        name = "��ͨ����";
        busload = 0;
        property = "ˮ½��";
        speed = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBusload() {
        return busload;
    }

    public void setBusload(int busload) {
        this.busload = busload;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return name +"�����ؿ�"+busload+"��"+",��ʱ��" + speed + "km/h,��"+property+"����" ;
    }
       
}
