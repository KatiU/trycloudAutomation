package com.TryCloud.step_definitions;

import com.TryCloud.pages.BasePage;
import com.TryCloud.utilities.BrowserUtils;
import com.TryCloud.utilities.ConfigurationReader;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US_1_LoginFunctionality extends BasePage{


    @Given("user on the login page")
    public void user_on_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

    }
    @When("user enter valid {string} and {string}")
    public void user_enter_valid_and(String username, String password) {
       loginWithoutClick(username,password);


    }
    @When("user click the login button")
    public void user_click_the_login_button() throws InterruptedException {
        Thread.sleep(2000);
        loginInput.click();


    }
    @Then("user should be at the dashboard page")
    public void user_should_be_at_the_dashboard_page() {
        BrowserUtils.waitForPageToLoad(5);

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("dashboard"));





    }













}



