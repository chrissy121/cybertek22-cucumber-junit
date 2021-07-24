package com.cybertek.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {


    /*this method accepts String expected title
    @PARAM ex
    */
    public static void assertTitle(String expectedTitle) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.titleIs(expectedTitle));

        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

     /*
        This method accepts a List<WebElements> and returns List<String>
        @param webElementList
     */

    public static List<String> getElementsText(List<WebElement> webElementList){

        //Create placeholder List<String>
        List<String> actualAsString = new ArrayList<>();
        for (WebElement each : webElementList) {
            actualAsString.add(each.getText());
        }
        return actualAsString;
    }

 /*
    Method that will accept int
    Wait for given second duration
     */
    public static void sleep(int second) {
        second *= 1000;
        try {

            Thread.sleep(second);

        } catch (InterruptedException e) {

            System.out.println("something happened in the sleep method");
        }
    }

}
