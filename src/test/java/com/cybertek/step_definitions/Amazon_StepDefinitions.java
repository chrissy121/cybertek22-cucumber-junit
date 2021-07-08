package com.cybertek.step_definitions;

import com.cybertek.pages.AmazonSearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Amazon_StepDefinitions {

    @Given("User is on Amazon home page")
    public void user_is_on_amazon_home_page() {
        Driver.getDriver().get("https://www.amazon.com");
    }
    @When("User searches for hats")
    public void user_searches_for_hats() {
        AmazonSearchPage amazonSearchPage = new AmazonSearchPage();
        amazonSearchPage.searchBar.sendKeys("hats for women" + Keys.ENTER);
    }
    @Then("User should see hats")
    public void user_should_see_hats() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedInTitle = "hats for women";

        Assert.assertTrue(actualTitle.contains(expectedInTitle));

    }
    @Then("User can add first hat into the cart")
    public void user_can_add_first_hat_into_the_cart() {
        AmazonSearchPage amazonSearchPage=new AmazonSearchPage();
        amazonSearchPage.firstWomenHat.click();
        amazonSearchPage.addToCartBtn.click();

    }


}
