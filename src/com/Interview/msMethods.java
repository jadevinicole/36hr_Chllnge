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

public class msMethods {

    WebDriver driver;


    public void launchBrowser() {
        System.setProperty("webdriver.chrome.driver", "C://Program Files//Selenium_Jars_N_Drivers//drivers//chromedriver/chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.get("https://www.microsoft.com/en-us/");
        driver.manage().window().maximize();
    }

    public void validateMenu() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement hoverOffice365 = driver.findElement(office365);
        actions.moveToElement(hoverOffice365).perform();
        Thread.sleep(1500);
        WebElement hoverOffice = driver.findElement(office);
        actions.moveToElement(hoverOffice).perform();
        Thread.sleep(1500);
        WebElement windows = driver.findElement(msWindows);
        actions.moveToElement(windows).perform();
        Thread.sleep(1500);
        WebElement surface = driver.findElement(msSurface);
        actions.moveToElement(surface).perform();
        Thread.sleep(1500);
        WebElement xbox = driver.findElement(Xbox);
        actions.moveToElement(xbox).perform();
        Thread.sleep(1500);
        WebElement deals = driver.findElement(Deals);
        actions.moveToElement(deals).perform();
        Thread.sleep(1500);
        WebElement support = driver.findElement(Support);
        actions.moveToElement(support).perform();
        Thread.sleep(1500);
        WebElement allMS = driver.findElement(allMicrosoft);
        actions.moveToElement(allMS).perform();
        Thread.sleep(1500);
    }

    public void navToWindowsPage() {
        WebElement windowsClick = driver.findElement(msWindows);
        windowsClick.click();
        driver.findElement(windows10).click();
    }
    public void printDropDownMenu() {
        Actions actions = new Actions(driver);
        WebElement text1 = driver.findElement(windows10_HowGetWindows);
        actions.moveToElement(text1).perform();
        System.out.println("The different Windows options are: ");
        System.out.println(text1.getText());
        WebElement text2 = driver.findElement(windows10_Home);
        actions.moveToElement(text2).perform();
        System.out.println(text2.getText());
        WebElement text3 = driver.findElement(windows10_Pro);
        actions.moveToElement(text3).perform();
        System.out.println(text3.getText());
        WebElement text4 = driver.findElement(windows10_RRT);
        actions.moveToElement(text4).perform();
        System.out.println(text4.getText());
        WebElement text5 = driver.findElement(windows10_End7);
        actions.moveToElement(text5).perform();
        System.out.println(text5.getText());
        WebElement text6 = driver.findElement(windows10_Features);
        actions.moveToElement(text6).perform();
        System.out.println(text6.getText());
        WebElement text7 = driver.findElement(windows10_syncPhoneComp);
        actions.moveToElement(text7).perform();
        System.out.println(text7.getText());
        WebElement text8 = driver.findElement(windows10_security);
        actions.moveToElement(text8).perform();
        System.out.println(text8.getText());
        WebElement text9 = driver.findElement(windows10_Editions);
        actions.moveToElement(text9).perform();
        System.out.println(text9.getText());
        WebElement text10 = driver.findElement(windows10_specsReqs);
        actions.moveToElement(text10).perform();
    }

    public void searchVS() throws InterruptedException{
        WebElement searchClick = driver.findElement(windowsPage_SearchButton);
        searchClick.click();
        searchClick.sendKeys("       Visual Studio");
        searchClick.sendKeys(Keys.ENTER);
        WebElement closeBox = driver.findElement(CloseBox);
        closeBox.click();
        Thread.sleep(5000);
        Actions actions = new Actions(driver);
        WebElement VS1 = driver.findElement(VSPrice1);
        actions.moveToElement(VS1).perform();
        System.out.println("The three top prices of Visual Studio are: ");
        System.out.println(VS1.getText());
        String VSP1 = VS1.getText();//price 1
        WebElement VS2 = driver.findElement(VSPrice2);
        actions.moveToElement(VS2).perform();
        System.out.println(VS2.getText());
        WebElement VS3 = driver.findElement(VSPrice3);
        actions.moveToElement(VS3).perform();
        System.out.println(VS3.getText());
        WebElement VS1Details = driver.findElement(VSDet1);
        VS1Details.click();
        WebElement closeBoxx = driver.findElement(CloseBox);
        closeBoxx.click();
        //WebElement VS1DetailsPrice = driver.findElement(VSDetPrc);//price 2
        //String VS1DP = VS1DetailsPrice.getText();
        //System.out.println("So far the prices we saw are: " + VSP1 + " and " +VS1DP);
        //System.out.println("The prices are the same ");
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        WebElement addCart = driver.findElement(addToCart);
        addCart.click();
        WebElement myQTY = driver.findElement(SelectQTY);
        myQTY.click();
        WebElement Qty20 = driver.findElement(Amnt20);
        //actions.moveToElement(Qty20).perform();
        Qty20.click();
        double float1 = 1199.00;
        double newFloat1 = 1199.00 * 20;
        System.out.println("The total price should be: " + newFloat1);
        WebElement newTotal = driver.findElement(TotalPrice);
        //System.out.println("The total price is: " + newTotal.getText());


        Thread.sleep(5000);

        }


    public void closeBrowser() {

        driver.quit();
    }

}








