package com.oops.superkeyword;

public class LoginPage extends Page {

    int timeOut = 200;
    public LoginPage(){
        super();
        //System.out.println("This is constructor calling");
        //super(10,20); //double super not allowed
    }

    public void loginInfo() {
        System.out.println("login info methods");
        System.out.println("....");
        super.display();
        display();
    }

    @Override
    public void display() {
        System.out.println("LP Display...");
        System.out.println("after using super keyword....");
        super.display();
    }

    public void getTimeOut() {
        System.out.println(timeOut);
        System.out.println(super.timeOut);
    }
}
