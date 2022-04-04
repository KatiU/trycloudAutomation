package com.TryCloud.step_definitions;

import com.TryCloud.pages.BasePage;
import com.TryCloud.pages.FavoritesSubModule;
import com.TryCloud.pages.FilesPage;
import com.TryCloud.pages.LandingPage;
import com.TryCloud.utilities.BrowserUtils;
import com.TryCloud.utilities.ConfigurationReader;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;



public class US_10_Files_Update_settings extends BasePage{

  LandingPage landingPage = new LandingPage();
  FilesPage  filesPage = new FilesPage();
  FavoritesSubModule favoritesSubModule = new FavoritesSubModule();
    String usageBeforeUpload;
    String currentStorageUsage = "";
    Driver driver;

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        login();

    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
        BrowserUtils.waitForVisibility(landingPage.talkBtn,5);
        landingPage.filesBtn.click();

    }
    @When("user clicks Settings on the left bottom corner")
    public void user_clicks_settings_on_the_left_bottom_corner() {
        filesPage.settingsBtn.click();

    }
    @Then("the user should be able to click any buttons")
    public void the_user_should_be_able_to_click_any_buttons() {

        int i = 0;
        for (WebElement each : filesPage.allcheckboxs) {

            boolean beforeClick = filesPage.allcheckboxs.get(i).isSelected();
            each.click();
            boolean afterClick = filesPage.allcheckboxs.get(i).isSelected();
            i++;

        }

    }
    @When("user checks the current storage usage")
    public void user_checks_the_current_storage_usage() {
        System.out.println("filesPage.storageUsage.getText() = " + filesPage.storageUsage.getText());
         usageBeforeUpload = filesPage.storageUsage.getText();

    }
    @When("the user clicks the add icon on the top")
    public void the_user_clicks_the_add_icon_on_the_top() {
        favoritesSubModule.addFile.click();

    }
    @When("user uploads file with the upload file option")
    public void user_uploads_file_with_the_upload_file_option() {
        String filePath = "/Users/yekaterinaudalov/Desktop/Screen Shot 2022-03-28 at 5.39.01 PM.png";
        BrowserUtils.waitForClickablility(favoritesSubModule.addFile,5);
        favoritesSubModule.addFile.click();

        filesPage.uploadFile.sendKeys(filePath);

    }
    @When("user refresh the page")
    public void user_refresh_the_page() {

        Driver.getDriver().navigate().refresh();

    }
    @Then("the user should be able to see storage usage is increased")
    public void the_user_should_be_able_to_see_storage_usage_is_increased() {

        Assert.assertNotEquals(usageBeforeUpload,filesPage.storageUsage.getText());
        filesPage.deleteFileBtn.click();





    }



}
