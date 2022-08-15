package com.rootcode.hrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddEmpPage {
    private final WebDriver driver;

    @FindBy(id = "firstName")
    private WebElement txtFirstname;

    @FindBy(id = "lastName")
    private WebElement txtLastname;

    @FindBy(id = "photofile")
    private WebElement profilePicElement;

    @FindBy(id = "chkLogin")
    private WebElement chkLogin;

    @FindBy(id = "user_name")
    private WebElement txtUsername;

    @FindBy(id = "user_password")
    private WebElement txtPassword;

    @FindBy(id = "re_password")
    private WebElement txtRePassword;


    @FindBy(id = "status")
    private WebElement lstStatus;


    @FindBy(id = "btnSave")
    private WebElement btnSave;


    public AddEmpPage(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }

    public AddEmpPage typeFirstName(String firstName) {
        txtFirstname.click();
        txtFirstname.sendKeys(firstName);
        return this;
    }

    public AddEmpPage typeFirstName(String lastName) {
        txtLastname.click();
        txtLastname.sendKeys(lastName);
        return this;
    }

    public void clickSave() {
        btnSave.click();
    }

    public AddEmpPage uploadProfilePicture(String filePath) {
        profilePicElement.sendKeys(filePath);
        return this;
    }

    public AddEmpPage checkLoginCredentials() {
        chkLogin.click();
        return this;
    }

    public AddEmpPage typeUsername(String userName) {
        txtUsername.clear();
        txtUsername.sendKeys(userName);
        return this;
    }

    public AddEmpPage typePassword(String password) {
        txtPassword.clear();
        txtPassword.sendKeys(password);
        return this;
    }


    public AddEmpPage typeRePassword(String password) {
        txtRePassword.clear();
        txtRePassword.sendKeys(password);
        return this;
    }


    public AddEmpPage selectStatus(String status) {
        //Working with Select
        Select selStatus = new Select(lstStatus);
        selStatus.selectByIndex(1);
        selStatus.selectByValue("Enabled");
        selStatus.selectByVisibleText(status);
        return this;
    }
}
