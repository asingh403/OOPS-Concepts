package com.oops.Interface_oops;

public interface USMedical extends WHO{

    public void physioServices();
    public void cardioServices();
    public void oncologyServices();
    public void emergencyServices();

    public static void billing(){
        System.out.println("US Medical -- billing");
    }

    default void medInsurance(){
        System.out.println("default -- US Med Isurance");
    }
}
