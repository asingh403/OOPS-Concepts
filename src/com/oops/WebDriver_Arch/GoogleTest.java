package com.oops.WebDriver_Arch;

public class GoogleTest {

    static  WebDriver driver;

    public static void main(String[] args) {
        //ChromeDriver driver = new ChromeDriver();
        //FirefoxDriver driver = new FirefoxDriver();
        //SafariDriver driver = new SafariDriver();

        //top casting
        //WebDriver driver = new ChromeDriver();

        String browser = "safari";

        if(browser.equals("chrome")){
            driver = new ChromeDriver();
        }
        else if(browser.equals("firefox")){
            driver = new FirefoxDriver();
        }
        else if(browser.equals("safari")){
            driver = new SafariDriver();
        }
        else {
            System.out.println("please pass the correct browser .. ..");
        }

        driver.get("https://www.google.com/");
        String title = driver.getTitle();
        System.out.println(title);


        driver.findElement();
        driver.findElements();

        driver.click();
        driver.sendKeys("test@gmail.com");
        driver.close();

    }

}
