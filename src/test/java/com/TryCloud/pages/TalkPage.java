package com.TryCloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TalkPage extends BasePage {

    @FindBy(xpath = "//input[@class='app-navigation-search__input']")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@class='rich-text--wrapper']")
    public List<WebElement> sentMessages;

    @FindBy(xpath = "//ul[@class='conversations']//a")
    public List<WebElement> convList;

    @FindBy(xpath = "//div[@role='textbox']")
    public WebElement messageBox;

    @FindBy(xpath = "//button[@aria-label='Send message']")
    public WebElement sendMsgBtn;

    @FindBy(xpath = "//div[.='You created the conversation']")
    public WebElement convCreatedText;
}
