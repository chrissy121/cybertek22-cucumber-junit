package com.cybertek.step_definitions;

import com.cybertek.pages.SmartBearOrderPage;
import com.cybertek.pages.SmartBear_LoginPage;
import com.cybertek.pages.WebOrdersPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class SmartBear_Stepdefinition {

    SmartBear_LoginPage loginPage = new SmartBear_LoginPage();
    SmartBearOrderPage orderPage = new SmartBearOrderPage();

    @Given("User is on the SmartBear login page")
    public void user_is_on_the_smart_bear_login_page() {
       String url = ConfigurationReader.getProperty("smartbearUrl");
        Driver.getDriver().get(url);

    }
    @When("user enters the given credentials")
    public void user_enters_the_given_credentials() {
        loginPage.userName.sendKeys("Tester");
        loginPage.password.sendKeys("test");

    }
    @When("user click the login button")
    public void user_click_the_login_button() {
        loginPage.loginBtn.click();

    }
    @Then("user should see the dashboard page")
    public void user_should_see_the_dashboard_page() {
        String expectedTitle = "Web Orders";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals("As a expected is not matching actual", expectedTitle, actualTitle);


    }

    @Given("User is on the SmartBear order page")
    public void user_is_on_the_smart_bear_order_page() {
        orderPage.orderMenu.click();
    }
    @When("User selects {string} from product dropdown")
    public void user_selects_from_product_dropdown(String string) {
        Select select = new Select(orderPage.product);
        select.selectByValue("FamilyAlbum");
    }
    @When("User enters {int} to quantity")
    public void user_enters_to_quantity(Integer qtyNum) {

        orderPage.qty.sendKeys(Keys.BACK_SPACE, qtyNum + "");
    }
    @When("User enters {string} to costumer name")
    public void user_enters_to_costumer_name(String customerName) {
        orderPage.customerName.sendKeys(customerName);
    }
    @When("User enters {string} to street")
    public void user_enters_to_street(String streetName) {
        orderPage.street.sendKeys(streetName);

    }
    @When("User enters {string} to city")
    public void user_enters_to_city(String cityName) {
        orderPage.city.sendKeys(cityName);
    }
    @When("User enters {string} to state")
    public void user_enters_to_state(String stateName) {
        orderPage.state.sendKeys(stateName);
    }
    @When("User enters {string}")
    public void user_enters(String zipCode) {
        orderPage.zip.sendKeys(zipCode);
    }
    @When("User selects {string} as card type")
    public void user_selects_as_card_type(String visa) {
        orderPage.visa.click();
    }
    @When("User enters {string} to card number")
    public void user_enters_to_card_number(String cardNumber) {
        orderPage.cardNum.sendKeys(cardNumber);
    }
    @When("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String expireDate) {
        orderPage.expireDate.sendKeys(expireDate);
    }
    @When("User clicks process button")
    public void user_clicks_process_button() {
        orderPage.processBtn.click();
    }
    @Then("User verifies {string} is in the list")
    public void userVerifiesIsInTheList(String expectedName) {
        orderPage.listAllOrders.click();

        String actualName  = orderPage.nameView.getText();

        Assert.assertEquals("As expected is not matching actual", expectedName, actualName);

    }
}
