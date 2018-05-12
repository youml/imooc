package com.exercises;

public class PassengerTrain extends Car implements ICarrier {
    private int busload;
    
    /**
     * @param name 车型   
     * @param rent  日租金
     * @param busload 载人量
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
        return this.getName()+"    "+this.getRent()+"元/天 载人:"+busload+"人";
    }
    
    
}
