package com.oops.WebDriver_Arch;

public class FirefoxDriver implements WebDriver{

    public FirefoxDriver(){
        System.out.println("launch the FireFox Browser . . . .");
    }
    @Override
    public void findElement() {
        System.out.println("find element");
    }

    @Override
    public void findElements() {
        System.out.println("find elements");
    }

    @Override
    public void click() {
        System.out.println("click on element");
    }

    @Override
    public void sendKeys(String value) {
        System.out.println("enter value"+ value);
    }

    @Override
    public void get(String url) {
        System.out.println("launch url :: "+ url);

    }

    @Override
    public String getTitle() {
        return "some Title";
    }

    @Override
    public void close() {
        System.out.println("close the browser");

    }

}
