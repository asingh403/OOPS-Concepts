package com.oops.Abstract_oops;

public class AmazonTest {

    public static void main(String[] args) {

        LoginPage lp = new LoginPage();

        lp.title();
        lp.header();
        lp.url();
        lp.doLogin("admin", "admin");


        HomePage hp = new HomePage();
        hp.header();
        hp.title();
        hp.url();
        hp.logout();

        //top casting
        //child class object can be referred by parent class abs ...

        Page p = new LoginPage();
        p.title();
        p.logo();
        p.header();
        p.url();




    }


}
