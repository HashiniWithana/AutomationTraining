package com.rootcode.hrm.pages;

import com.fasterxml.jackson.core.JsonParser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LoginPage {

    private final WebDriver driver;

    @FindBy(id = "txtUsername")
    private WebElement txtUsername;

    @FindBy(id = "txtPassword")
    private WebElement txtPassword;

    @FindBy(id = "btnLogin")
    private WebElement btnLogin;

    @FindBy(id = "spanMessage")
    private WebElement lblError;


    public LoginPage(WebDriver driver){
        this.driver = driver;

        PageFactory.initElements(this.driver, this);
    }

    public LoginPage typeUserName(String username){
        txtUsername.clear();
        txtUsername.sendKeys(username);
        return this;
    }

    public LoginPage typePassword(String password){
        txtPassword.clear();
        txtPassword.sendKeys(password);
        return this;
    }

    public void clickLogin() {
        btnLogin.click();
    }

    public String getError() throws IOException {
        return lblError.getText();
    }

    public LoginPage clearUsername() {
        txtPassword.clear();
        return this;
    }

    public LoginPage clearPassword() {
        txtPassword.clear();
        return this;
    }
}
