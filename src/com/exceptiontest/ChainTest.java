package com.exceptiontest;


public class ChainTest {
    /**
     * 
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
