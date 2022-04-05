package com.TryCloud.step_definitions;

import com.TryCloud.pages.BasePage;
import com.TryCloud.utilities.BrowserUtils;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US_2InvalidLogin extends BasePage {

    @When("user enter invalid {string} and {string}")
    public void user_enter_invalid_and(String username, String password) {
        login(username,password);


    }
    @Then("verify {string} should be displayed")
    public void verify_should_be_displayed(String message) {

        Assert.assertTrue( wrongCrdMsg.isDisplayed());

    }

}
