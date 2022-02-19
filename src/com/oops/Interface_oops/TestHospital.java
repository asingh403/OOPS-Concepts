package com.oops.Interface_oops;

public class TestHospital {

    public static void main(String[] args) {
        FortisHospital fh = new FortisHospital();

        fh.dentalServices();
        fh.pediaServices();
        fh.pediaServices();
        fh.dentalServices();
        fh.cardioServices();
        fh.emergencyServices();
        fh.entServices();
        fh.oncologyServices();
        fh.orthoServices();
        fh.physioServices();

        System.out.println(USMedical.min_fee + " :: Default fee.");

        System.out.println("----");
        USMedical us = new FortisHospital();
        us.cardioServices();
        us.emergencyServices();
        us.oncologyServices();
        us.physioServices();
        USMedical.billing();
        fh.medInsurance();

        fh.medicalInfo();
        UNHG.covidGuideLines();

        System.out.println("******");
        IndianMedical in = new FortisHospital();
        in.dentalServices();
        in.emergencyServices();
        in.orthoServices();

        fh.CovidTest();




    }



}
