package com.vehicle;

public class Vehicle {
    public String name;
    public int busload;
    public String property;
    public int speed;
    
    public Vehicle() {
        name = "交通工具";
        busload = 0;
        property = "水陆空";
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
        return name +"可以载客"+busload+"人"+",以时速" + speed + "km/h,在"+property+"航行" ;
    }
       
}
