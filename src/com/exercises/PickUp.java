package com.exercises;

public class PickUp extends Car implements ICarrier, ITruck {
    private int burden;
    private int busload;
    
    /**
     * @param name 车型
     * @param rent 日租金
     * @param busload 载人量
     * @param burden 载货量
     */
    public PickUp(String name, int rent,int busload ,int burden) {
        // TODO Auto-generated constructor stub
        super(name, rent);
        this.burden = burden;
        this.busload = busload;
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
        return this.getName()+"    "+this.getRent()+"元/天 载人:"+busload+" 载货:"+burden+"吨";
    }
    
    
}
