package com.vehicle;

public class Initial {

    public static void main(String[] args) {
        // TODO Auto-generated method stub        
        Vehicle bus = new Bus();
        Vehicle train = new Train();
        Vehicle aeroplane = new Aeroplane();
        Vehicle carriage = new Carriage();
        Vehicle ship = new Ship();
        
        System.out.println(bus);
        System.out.println(train);
        System.out.println(aeroplane);
        System.out.println(carriage);
        System.out.println(ship);
    }

}
