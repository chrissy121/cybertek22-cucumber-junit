package com.cybertek.utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OfficeHoursUtils {
    static String userName = "oscarDemo";
    static String password = "oscar123";
    public static WebElement userNameBox(WebDriver driver) {
        return driver.findElement(By.name("username"));
    }
    public static WebElement passwordBox(WebDriver driver) {
        return driver.findElement(By.xpath("password"));
    }


    public static void productAdder(WebDriver driver, String category, String product) {

        driver.findElement(By.xpath("//a[.='" + category + "']")).click();
        BrowserUtils.sleep(1);
        driver.findElement(By.xpath("//a[.='" + product + "']")).click();
        BrowserUtils.sleep(1);
        driver.findElement(By.xpath("//a[.='Add to cart']")).click();
        BrowserUtils.sleep(1);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        BrowserUtils.sleep(1);
        driver.findElement(By.xpath("(//a[@class='nav-link'])[1]")).click();
        //return amount;
    }
    public static void productRemover(WebDriver driver, String product){
        // //tbody//tr//td[.='Apple monitor 24']/..//td[.='Delete']/a
        driver.findElement(By.xpath("//a[.='Cart']")).click();
        BrowserUtils.sleep(1);
        driver.findElement(By.xpath("//tbody//tr//td[.='"+ product + "']/..//td[.='Delete']/a")).click();
        BrowserUtils.sleep(3);
    }

    public static void addUserTest(WebDriver driver, String url) {
        driver.get(url);
        userNameBox(driver).sendKeys(userName);
        passwordBox(driver).sendKeys(password);
        driver.findElement(By.xpath("//input[@name='FormsButton2']")).click();

    }
    public static boolean positiveLoginTest(WebDriver driver, String url) {
        driver.get(url);
        userNameBox(driver).sendKeys(userName);
        passwordBox(driver).sendKeys(password);
        driver.findElement(By.xpath("//input[@type='button']")).click();
        WebElement successMessage = driver.findElement(By.xpath("//b[.='**Successful Login**']"));
        return successMessage.isDisplayed();
    }
    public static boolean negativeLoginTest(WebDriver driver, String url) {
        driver.get(url);
        userNameBox(driver).sendKeys(userName.substring(1));
        passwordBox(driver).sendKeys(password);
        driver.findElement(By.xpath("//input[@type='button']")).click();
        WebElement failMessage = driver.findElement(By.xpath("//b[.='**Failed Login**']"));
        return failMessage.isDisplayed();
    }

    public static double priceConverter(String price) {
        String temp = "";
        for (int i = 0; i<price.length(); i++) {
            if(Character.isDigit(price.charAt(i))) {
                temp += ""+price.charAt(i);
            }
            if(price.charAt(i)== '.') {
                temp += price.charAt(i);
            }
        }
        return Double.parseDouble(temp);
    }

}
