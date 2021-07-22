package com.cybertek.step_definitions;

import com.cybertek.pages.SmartBear_LoginPage;
import com.cybertek.pages.WebOrdersPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class SmartBear_Stepdefinition {
   SmartBear_LoginPage smartBear_loginPage = new SmartBear_LoginPage();
   WebOrdersPage webOrdersPage = new WebOrdersPage();

    @Given("User is logged SmartBear account")
    public void user_is_logged_smart_bear_account() {
        String url = ConfigurationReader.getProperty("smartBearUrl");
        Driver.getDriver().get(url);
        smartBear_loginPage.userName.sendKeys("Tester");
        smartBear_loginPage.password.sendKeys("test");
        smartBear_loginPage.loginBtn.click();
        smartBear_loginPage.orderMenu.click();
    }
    @When("user can be order page")
    public void user_can_be_order_page() throws InterruptedException {
        Select select= new Select(webOrdersPage.product);
        select.selectByValue("FamilyAlbum");
        webOrdersPage.quantity.clear();
//        webOrdersPage.quantity.sendKeys("4");

    }
    @Then("user selects FamilyAlbum from product dropdown")
    public void user_selects_family_album_from_product_dropdown() {

    }
    @Then("User enters {int} to quantity")
    public void user_enters_to_quantity(Integer int1) {

    }
    @Then("User enters John Wick to costumer name")
    public void user_enters_john_wick_to_costumer_name() {

    }
    @Then("User enters Kinzie Ave to street")
    public void user_enters_kinzie_ave_to_street() {

    }
    @Then("User enters Chicago to city")
    public void user_enters_chicago_to_city() {

    }
    @Then("User enters IL to state")
    public void user_enters_il_to_state() {

    }
    @Then("User enters {int}")
    public void user_enters(Integer int1) {

    }
    @Then("User selects Visa as card type")
    public void user_selects_visa_as_card_type() {

    }
    @Then("User enters {int} to card number")
    public void user_enters_to_card_number(Integer int1) {

    }
    @Then("User enters {int}\\/{int} to expiration date")
    public void user_enters_to_expiration_date(Integer int1, Integer int2) {

    }
    @Then("User clicks process button")
    public void user_clicks_process_button() {

    }
    @Then("User verifies JohnWick is in the list")
    public void user_verifies_john_wick_is_in_the_list() {

    }

}
