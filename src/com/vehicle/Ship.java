package com.vehicle;

public class Ship extends Vehicle {
    public Ship() {
        name = "����";
        busload = 150;
        property = "����";
        speed = 20;
    }
    
    @Override
    public String toString() {
        return name +"�����ؿ�"+busload+"��"+",�Ծ���" + speed + "��,��"+property+"����";
    }
}
