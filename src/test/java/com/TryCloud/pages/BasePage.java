package com.TryCloud.pages;
import com.TryCloud.tests.ExcelRead;
import com.TryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
import static com.TryCloud.utilities.ConfigurationReader.getProperty;
import static com.TryCloud.utilities.Driver.getDriver;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "submit-form")
    public WebElement loginInput;

    @FindBy(id = "lost-password")
    public WebElement forgotPasswordLink;

    @FindBy(xpath = "//a[normalize-space(text()) = 'Log in with a device']")
    public WebElement loginWithDeviceLink;

    @FindBy(css = ".warning")
    public WebElement wrongCrdMsg;

    public void login(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginInput.click();
    }

    public void loginWithoutClick(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
    }

    public void login() {
        getDriver().get(getProperty("env"));
        try {
            ExcelRead read = new ExcelRead();
            usernameInput.sendKeys(read.sheet.getRow(2).getCell(0).toString());
            passwordInput.sendKeys(read.sheet.getRow(2).getCell(1).toString());
            loginInput.click();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



