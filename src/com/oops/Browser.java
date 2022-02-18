package com.oops;

public class Browser {

    String name;
    double version;
    String vendor;


    public void getInfo(Browser br){
        System.out.println(br.name+" "+ br.version+" "+ br.vendor);
    }

    public static void main(String[] args) {

        Browser b = new Browser();
        b.name= "Safari";
        b.version = 19.01;
        b.vendor = "Apple";
        b.getInfo(b);

    }
}
