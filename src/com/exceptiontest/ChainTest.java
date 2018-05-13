package com.exceptiontest;


public class ChainTest {
    /**
     * test1():抛出"喝大了"异常
     * test2():调用test1(),捕获"喝大了"异常,并且包装成运行时异常,并继续抛出
     * main方法中,调用test2(),尝试捕获test2()方法抛出的异常
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ChainTest cTest = new ChainTest();
        try {
            cTest.test2();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    
    
    public void test1() throws DrunkException{
        throw new DrunkException("喝车别开酒！");
    }
    
    public void test2() {
        try {
            test1();
        }catch (DrunkException e) {
            // TODO: handle exception
            RuntimeException  newExc = new RuntimeException("司机一滴酒,亲人两行泪~~");
            newExc.initCause(e);
            throw newExc;
        }
    }
}
