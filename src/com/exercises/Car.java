package com.exercises;

//��
public abstract class Car {
    //�ͺ�
    private String name;
    //�����
    private int rent;
    
    public Car() {
        // TODO Auto-generated constructor stub
    }
    
    /**
     * @param name ����
     * @param rent �����
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
