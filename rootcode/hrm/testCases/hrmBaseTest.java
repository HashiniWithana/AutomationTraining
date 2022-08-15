package com.rootcode.hrm.testCases;

import com.rootcode.hrm.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

public class hrmBaseTest {

    private WebDriver driver;

    @BeforeSuite

    public void setup() {
        WebDriverManager.chromedriver().setup();
    }

    protected void login(WebDriver driver) {
        this.driver=driver;
        LoginPage loginPage=new LoginPage(driver);
        loginPage.typeUserName("Admin").typePassword("Ptl@#321").clickLogin();
    }
}
