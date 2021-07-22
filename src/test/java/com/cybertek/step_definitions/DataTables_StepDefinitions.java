package com.cybertek.step_definitions;

import com.cybertek.pages.LibraryLoginPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.Map;

public class DataTables_StepDefinitions {

    LibraryLoginPage loginPage = new LibraryLoginPage();

    @Given("user is on the login page of library app")
        public void user_is_on_the_login_page_of_library_app() {
        String url = ConfigurationReader.getProperty("libraryUrl");
        Driver.getDriver().get(url);
}
    @When("user enters username and password as below")
    public void user_enters_username_and_password_as_below(Map<String, String> loginInfo) {

//        String username = loginInfo.get("username");
//        String password = loginInfo.get("password");

       loginPage.emailInput.sendKeys(loginInfo.get("username"));
       loginPage.passwordInput.sendKeys(loginInfo.get("password"));

       loginPage.signIn.click();

    }
    @Then("user should see title is something")
    public void user_should_see_title_is_something() throws InterruptedException {
        BrowserUtils.sleep(2);
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Library";

        BrowserUtils.sleep(2);
        Assert.assertEquals(actualTitle, expectedTitle);

    }
    @Then("user should see below words displayed")
    public void user_should_see_below_words_displayed(List<String> listOfFruits) {
        System.out.println("listOfFruits.size() = " + listOfFruits.size());
        System.out.println("listOfFruits = " + listOfFruits);
    }

}
