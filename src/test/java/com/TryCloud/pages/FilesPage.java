package com.TryCloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FilesPage extends BasePage{


    @FindBy(id = "headerSelection")
    public WebElement checkAllFilesCheckBox;

    @FindBy(xpath = "//div[starts-with(@class,'fileActionsMenu')]//li[3]")
    public WebElement addToFavBtn;

    @FindBy(xpath = "//a[@class='action action-menu permanent']")
    public List<WebElement> allActionButtons;

    @FindBy(xpath = "//ul[@class='with-icon']/li/a")
    public List<WebElement> subModules;

    @FindBy(xpath = "//span[@class='innernametext']")
    public List<WebElement> fileNames;

    @FindBy(css = ".icon-add")
    public WebElement addFileIcon;

    @FindBy(xpath = "//input[@id='file_upload_start']")
    public WebElement uploadFileBtn;

    @FindBy(xpath = "//span[.='New folder']")
    public WebElement newFolderBtn;

    @FindBy(xpath = "//input[@value='New folder']")
    public WebElement newFolderNameBox;

    @FindBy(xpath = "//input[@type='submit' and @class='icon-confirm']")
    public WebElement newFolderSubmitBtn;

    @FindBy(xpath = "//div[@class='activitysubject']/a")
    public WebElement fileCreationMsg;

    @FindBy(xpath = "//tbody[@id='fileList']/tr//div[@class='thumbnail']")
    public List<WebElement> uploadedFilesStyle;

    @FindBy(xpath = "//div[contains(@class,'fileActionsMenu')]//a/span[2]")
    public List<WebElement> actionIconOptions;

    @FindBy(id = "commentsTabView")
    public WebElement commentsTab;

    @FindBy(css = ".message")
    public WebElement commentIB;

    @FindBy(xpath = "//form[@class='newCommentForm']/input[@type='submit']")
    public WebElement commentSubmitBtn;

    @FindBy(xpath = "//button[normalize-space()='Settings']")
    public WebElement settingsBtn;

    //@FindBy(xpath = "//input[@class='checkbox']")
    @FindBy(xpath = "//div[@id='app-settings-content']//input[@type='checkbox']//following-sibling::label")
    public List<WebElement> allcheckboxs; //three settings checkboxes;

    @FindBy(id = "headerSelection")
    public WebElement selectAllFilesCheckBox;

    @FindBy(xpath = "//input[@id='file_upload_start']")
    public WebElement uploadFile;

    @FindBy(xpath = "//span[@class='icon icon icon-delete']")
    public WebElement deleteFolder;
    //@FindBy(xpath = "//span[text()='Delete folder']")
    @FindBy(xpath = "//span[@class='icon icon-more']")
    public WebElement deleteFileBtn;

    @FindBy(xpath = "//input[contains(@id,'select-files')]")
    public List<WebElement> uploadedFiles;


    @FindBy(xpath = "//label[contains(@for,'Toggle')]")
    public List<WebElement> settingOptions;

    @FindBy(xpath = "//li[@id='quota']//p")
    public WebElement storageUsage;

    @FindBy(xpath = "//*[@id=\"oc-dialog-fileexists-content\"]/table/tbody/tr/th[1]/label")
    public WebElement checkboxInPopUp;

    @FindBy(xpath = "//button[text()='Continue'] ")
    public WebElement continuePopUp;

    @FindBy(xpath = "//h2[@class='app-sidebar-header__maintitle']")
    public WebElement sideBarTitle;

    @FindBy(xpath = "//span[@class='app-sidebar-tabs__tab-icon icon-share']")
    public WebElement sideBarShareIcon;
}
