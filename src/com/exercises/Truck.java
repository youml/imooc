package com.exercises;

//货车
public class Truck extends Car implements ITruck {
    private int burden;
    
    /**
     * @param name 车型
     * @param rent 日租金
     * @param burden 载货量
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
        return this.getName()+"    "+this.getRent()+"元/天 载货:"+burden+"吨";
    }
    
    
}
