package com.exercises;

//����
public class Truck extends Car implements ITruck {
    private int burden;
    
    /**
     * @param name ����
     * @param rent �����
     * @param burden �ػ���
     */
    public Truck(String name, int rent, int burden) {
        // TODO Auto-generated constructor stub
        super(name, rent);
        this.burden = burden;
    }
    
    @Override
    public void setBurden(int burden) {
        // TODO Auto-generated method stub
        this.burden = burden;
    }

    @Override
    public int getBurden() {
        // TODO Auto-generated method stub
        return burden;
    }

    @Override
    public String toString() {
        return this.getName()+"    "+this.getRent()+"Ԫ/�� �ػ�:"+burden+"��";
    }
    
    
}
