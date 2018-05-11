package com.vehicle;

public class Ship extends Vehicle {
    public Ship() {
        name = "游轮";
        busload = 150;
        property = "海上";
        speed = 20;
    }
    
    @Override
    public String toString() {
        return name +"可以载客"+busload+"人"+",以均速" + speed + "节,在"+property+"航行";
    }
}
