package com.TryCloud.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class LandingPage extends BasePage {

    @FindBy(xpath = "//a[@aria-label='Talk']")
    public WebElement talkBtn;

    @FindBy(xpath = "//*[@class='app-navigation']")
    public WebElement navigationBtn;

    @FindBy(xpath = "//*[normalize-space(text()) = 'User100']")
    public WebElement user;

    @FindBy(xpath = "//*[@href='/index.php/apps/contacts/']")
    public WebElement contactBtn;

    @FindBy (xpath = "//div[@class='logo logo-icon']") public WebElement mainLogo;

    @FindBy(xpath = "//a[@aria-label='Files']")
    public WebElement filesBtn;

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[@tabindex='-1']/a")
    public List<WebElement> landingPageModules;

    @FindBy(xpath = "//div[contains(@class,'unified-search')]/a")
    public WebElement searchIcon;

    @FindBy(xpath = "//input[@class='unified-search__form-input']")
    public WebElement searchBox;

    @FindBy(xpath = "//h3[@class='unified-search__result-line-one']")
    public WebElement searchBoxResult;

    @FindBy(xpath = "//li[contains(@class,'router-link-exact-active active')]//span[contains(@class,'line-one__title')]")
    public WebElement actualSearchedText;


}
