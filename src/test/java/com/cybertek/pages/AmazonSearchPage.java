package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSearchPage {
    public AmazonSearchPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBar;

    @FindBy(xpath = "(//div[@data-index='2'])[1]")
    public WebElement firstWomenHat;

    @FindBy(id = "add-to-cart-button")
    public WebElement addToCartBtn;
}
