package com.oops.Interface_oops;

public class FortisHospital extends UNHG implements USMedical, UKMedical, IndianMedical {


    @Override
    public void physioServices() {
        System.out.println("FH -- physioServices");
    }

    @Override
    public void cardioServices() {
        System.out.println("FH -- cardioServices");
    }

    @Override
    public void oncologyServices() {
        System.out.println("FH -- oncologyServices");

    }

    @Override
    public void emergencyServices() {
        System.out.println("US -- emergencyServices");
    }

    @Override
    public void entServices() {
        System.out.println("UK -- oncologyServices");
    }

    @Override
    public void pediaServices() {
        System.out.println("UK -- pediaServices");
    }

    @Override
    public void orthoServices() {
        System.out.println("India -- orthoServices");
    }

    @Override
    public void dentalServices() {
        System.out.println("India -- dentalServices");

    }

    //Fortis Hospital own method
    public static void medicalTraning(){
        System.out.println("Fortis -- Medical Training");
    }

    public static void opdTraning(){
        System.out.println("Fortis -- OPD_Services");
    }


    @Override
    public void CovidTest() {
        System.out.println("WHO -- Covid Test");
    }
}
