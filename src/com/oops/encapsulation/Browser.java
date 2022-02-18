package com.oops.encapsulation;

public class Browser {

    public void launchBrowser() {
        System.out.println("launch browser");
        checkVersion();
        checkOSVersion();
        checkEnoughRAM();
    }

    private void checkVersion() {
        System.out.println("check Browser version");
    }

    private void checkOSVersion() {
        System.out.println("check OS version");
    }

    private void checkEnoughRAM() {
        System.out.println("check Enough RAM");
    }

}
