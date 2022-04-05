package com.TryCloud.step_definitions;

import com.TryCloud.pages.BasePage;
import com.TryCloud.pages.LandingPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;



import java.util.List;

public class US_3_AllModules extends BasePage{

    LandingPage landingPage = new LandingPage();

    @When("the users log in with valid credentials")
    public void the_users_log_in_with_valid_credentials() {
        login();


    }
    @Then("Verify the user see the following modules:")
    public void verify_the_user_see_the_following_modules(List<String> expectedModulesNames) {
        List<String> actualModuleNames = landingPage.getTextModules();

        Assert.assertEquals(expectedModulesNames, actualModuleNames);

    }

}









