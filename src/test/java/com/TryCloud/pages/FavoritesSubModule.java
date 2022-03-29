package com.TryCloud.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FavoritesSubModule extends BasePage {

    @FindBy(xpath = "//a[@class='nav-icon-favorites svg']")
    public WebElement fvrSubModule;

    @FindBy(xpath = "//span[@class='innernametext']")
    public WebElement fileInFvr;

    @FindBy(xpath = "//span[.='Remove from favorites']")
    public WebElement removeFromFav;

    @FindBy(xpath = "//a[@class='button new']")
    public WebElement addFile;

    @FindBy(xpath = "//a[@class='menuitem' and @data-filetype='folder' ]")
    public WebElement newFolder;
    @FindBy(xpath = "//a[@class='name']//span[@class='innernametext' and .='Talk']")
    public WebElement File;
    @FindBy(xpath = "//span[@class='innernametext' and .='Credentials']")
    public WebElement FileXls;
    @FindBy(xpath = "//a[@class='action action-menu permanent' and @data-action='menu']")
    public WebElement firstAction;
    @FindBy(xpath = "//span[.='Remove from favorites']")
    public WebElement removeFav;

    @FindBy(id = "view24-input-folder")
    public WebElement newFileBox;

    @FindBy(xpath = "//input[@class='icon-confirm' ]")
    public WebElement createFile;

}
