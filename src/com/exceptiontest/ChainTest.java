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
        throw new DrunkException("�ȳ��𿪾ƣ�");
    }
    
    public void test2() {
        try {
            test1();
        }catch (DrunkException e) {
            // TODO: handle exception
            RuntimeException  newExc = new RuntimeException("˾��һ�ξ�,����������~~");
            newExc.initCause(e);
            throw newExc;
        }
    }
}
