package com.oops;

public class TestBlock {

    static {
        System.out.println("static Block");
    }


    public static void test() {
        System.out.println("test");
    }

    public static void main(String[] args) {

        System.out.println("This is main method");
        test();

    }
}
