package com.Interview;


import org.openqa.selenium.WebDriver;

public class amznTest {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;

        amznMethods methods = new amznMethods();
        methods.launchBrowser();
        methods.signUp();
        methods.searchEcho();



        Thread.sleep(5000);
        methods.closeBrowser();


    }

}
