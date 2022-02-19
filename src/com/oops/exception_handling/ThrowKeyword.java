package com.oops.exception_handling;

public class ThrowKeyword {

    public void myException(){
        try {
            throw new Exception("ASHUTOSH_EXCEPTION");
        } catch (Exception e) {
            System.out.println("Some Exception is coming....");
            e.printStackTrace();
        }
    }

    public void useCase(){
        String data = null;
        if(data == null){
            myException();
        }
    }

    public static void main(String[] args) {
        ThrowKeyword obj = new ThrowKeyword();
        obj.useCase();
    }
}
