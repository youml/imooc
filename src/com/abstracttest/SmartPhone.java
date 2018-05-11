package com.abstracttest;

public class SmartPhone extends Telphone {

    @Override
    public void call() {
        // TODO Auto-generated method stub
        System.out.println("通过语音打电话");
    }

    @Override
    public void message() {
        // TODO Auto-generated method stub
        System.out.println("通过语音发短信");

    }

}
