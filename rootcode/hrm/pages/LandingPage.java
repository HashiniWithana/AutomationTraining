package com.rootcode.hrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    private final WebDriver driver;

    @FindBy(id = "welcome")
    private WebElement linkWelcome;

    @FindBy(linkText = "Logout")
    private WebElement linkLogout;

    public LandingPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public String getWelcomeMsg(){
        return linkWelcome.getText();
    }

    public void logout(){
        linkWelcome.click();
        linkLogout.click();
    }
}
