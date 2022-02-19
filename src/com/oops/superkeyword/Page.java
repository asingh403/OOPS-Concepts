package com.oops.superkeyword;

public class Page {

    public Page(){
        System.out.println("default constructor ...");
    }

    public Page(int a){
        System.out.println("constructor ... "+ a);
    }

    public Page(int a, int b){
        System.out.println("constructor ... "+ (a+b))   ;
    }

    int timeOut = 100;
    public void display() {
        System.out.println("Page Parent class --  Display");
    }
}
