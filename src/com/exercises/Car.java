package com.exercises;

//车
public abstract class Car {
    //型号
    private String name;
    //日租金
    private int rent;
    
    public Car() {
        // TODO Auto-generated constructor stub
    }
    
    /**
     * @param name 车型
     * @param rent 日租金
     */
    public Car(String name, int rent) {
        this.name = name;
        this.rent = rent;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRent() {
        return rent;
    }
    public void setRent(int rent) {
        this.rent = rent;
    }


    
    
}
