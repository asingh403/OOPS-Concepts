package com.oops.encapsulation;

public class Company {

    public String name;
    private int sharePrices;
    public String hq;

    public int getSharePrices() {
        return sharePrices;
    }

    public void setSharePrices(int sharePrices) {
        this.sharePrices = sharePrices;
    }

    public static void main(String[] args) {
        Company comp = new Company();

        comp.name = "IBM";
        comp.sharePrices = 189;
        comp.hq = "Atlanta";
    }
}
