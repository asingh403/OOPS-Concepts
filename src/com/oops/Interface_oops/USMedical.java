package com.oops.Interface_oops;

public interface USMedical extends WHO {

    /**
     * we can write static and final both are also fine,
     * since interface provide by default static final so no need to write:
     * public static final int min_fee = 100;
     */
    public int min_fee = 100;

    public void physioServices();

    public void cardioServices();

    public void oncologyServices();

    public void emergencyServices();

    public static void billing() {
        System.out.println("US Medical -- billing");
    }

    default void medInsurance() {
        System.out.println("default -- US Med Isurance");
    }
}
