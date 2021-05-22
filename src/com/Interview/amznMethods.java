package com.Interview;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.concurrent.TimeUnit;

import static com.Interview.elementPaths.*;

public class amznMethods {

    WebDriver driver;


    public void launchBrowser() {
        System.setProperty("webdriver.chrome.driver", "C://Program Files//Selenium_Jars_N_Drivers//drivers//chromedriver/chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
    }

    public void signUp() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement hSI = driver.findElement(HelloSignIn);
        actions.moveToElement(hSI).perform();
        Thread.sleep(1500);
        WebElement strthere = driver.findElement(StartHere);
        strthere.click();
        Thread.sleep(1500);
        WebElement newName = driver.findElement(By.xpath("//*[@id=\"ap_customer_name\"]"));
        newName.click();
        newName.sendKeys("     Example Name");
        WebElement newEmail = driver.findElement(By.xpath("//*[@id=\"ap_email\"]"));
        newEmail.click();
        newEmail.sendKeys("     Example@email.com");
        WebElement newPwd = driver.findElement(By.xpath("//*[@id=\"ap_password\"]"));
        newPwd.click();
        newPwd.sendKeys("     P@ssW0rd");
        WebElement rePwd = driver.findElement(By.xpath("//*[@id=\"ap_password_check\"]"));
        rePwd.click();
        rePwd.sendKeys("     P@ssW0rd");
        WebElement createNewCus = driver.findElement(By.xpath("//*[@id=\"continue\"]"));
        createNewCus.click();
        WebElement goBack = driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[1]/div[1]/div/a/i"));
        Thread.sleep(4000);
        goBack.click();
    }

    public void searchEcho() {
        WebElement serchBar = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        serchBar.click();
        serchBar.sendKeys("   Echo Support");
        WebElement serchBttn = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
        serchBttn.click();
        Actions actions = new Actions(driver);
        WebElement ekoCS = driver.findElement(AECS);
        actions.moveToElement(ekoCS).perform();
        WebElement eko = driver.findElement(ECHO);
        actions.moveToElement(eko).perform();
        WebElement ekoDOT = driver.findElement(echoDOT);
        actions.moveToElement(ekoDOT).perform();
        WebElement ekoPLUS = driver.findElement(echoPLUS);
        actions.moveToElement(ekoPLUS).perform();
        WebElement ekoSHOW= driver.findElement(echoSHOW);
        actions.moveToElement(ekoSHOW).perform();

    }

    public void closeBrowser() {

        driver.quit();
    }

}
