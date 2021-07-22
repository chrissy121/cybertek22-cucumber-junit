package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {
    public GoogleSearchPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "q")
    public WebElement searchBar;

    public static class WikiSearchPage {

        public WikiSearchPage() {
            PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy(id = "searchInput")
        public WebElement searchBox;

        @FindBy(xpath = "//button[@type='submit']")
        public WebElement searchBtn;

        @FindBy(id = "firstHeading")
        public WebElement mainHeader;

        @FindBy(xpath = "//table[@class='infobox biography vcard']//tr[1]")
        public WebElement imageHeader;
    }
}
