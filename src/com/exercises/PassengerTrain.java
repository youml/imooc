package com.exercises;

public class PassengerTrain extends Car implements ICarrier {
    private int busload;
    
    /**
     * @param name ����   
     * @param rent  �����
     * @param busload ������
     */
    public  PassengerTrain(String name, int rent, int busload) {
        // TODO Auto-generated constructor stub
        super(name, rent);
        this.setBusload(busload);
    }
    
    @Override
    public void setBusload(int busload) {
        // TODO Auto-generated method stub
        this.busload = busload;
    }

    @Override
    public int getBusload() {
        // TODO Auto-generated method stub
        return busload;
    }

    @Override
    public String toString() {
        return this.getName()+"    "+this.getRent()+"Ԫ/�� ����:"+busload+"��";
    }
    
    
}
