package com.Interview;


import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;
import static com.Interview.elementPaths.*;
import static com.Interview.msMethods.*;


public class MS_Test {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;

        msMethods methods = new msMethods();
        methods.launchBrowser();
        methods.validateMenu();
        methods.navToWindowsPage();
        methods.printDropDownMenu();
        methods.searchVS();


        Thread.sleep(5000);
        methods.closeBrowser();


    }


}
