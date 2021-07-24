package com.cybertek.step_definitions;


import com.cybertek.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    //import from io.cucumber.java
    @Before(value = "@login", order = 1 )
    public void setupLoginScenario() {
        System.out.println("Setting up browser with further details..");
    }
    @Before
    public void setupScenario() {
        System.out.println("Setting up browser with further details..");
    }

    @After
    public void tearDownScenario(Scenario scenario) {

        //scenario.isFailed()
        //Take screenshot


        if(scenario.isFailed()) {

            byte [] screenshot =((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }


        System.out.println("---TearDown steps are being applied...");
        //Driver.closeDriver();

    }
    @BeforeStep
    public void setupStep() {
        System.out.println("---setup applying for each step");
    }
    @AfterStep
    public void afterStep() {
        System.out.println("---teardown applying for each step");
    }
}
