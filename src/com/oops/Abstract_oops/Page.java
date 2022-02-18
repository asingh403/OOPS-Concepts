package com.oops.Abstract_oops;

public abstract class Page {

    public Page(){
        System.out.println("PAGE -- Default Constructor");
    }

    public Page(int t){
        System.out.println("PAGE -- One Params Constructor"+ t);
    }

    public abstract void title();
    public abstract void url();


    public void header(){
        System.out.println("Page Header !!");
    }

    public final void logo(){
        System.out.println("Page -- logo");
    }







}
