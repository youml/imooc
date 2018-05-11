package com.abstracttest;

public class Initial {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Telphone tel1 = new CellPhone();
        tel1.call();
        tel1.message();
        
        Telphone tel2 = new SmartPhone();
        
        tel2.call();
        tel2.message();
        
        IPlayGame ip1 = new SmartPhone();
        IPlayGame ip2 = new Psp();
        
        ip1.playGame();
        ip2.playGame();
    }

}
