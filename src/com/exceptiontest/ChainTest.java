package com.exceptiontest;


public class ChainTest {
    /**
     * test1():�׳�"�ȴ���"�쳣
     * test2():����test1(),����"�ȴ���"�쳣,���Ұ�װ������ʱ�쳣,�������׳�
     * main������,����test2(),���Բ���test2()�����׳����쳣
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
