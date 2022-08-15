package com.rootcode.hrm.testCases;
import com.rootcode.hrm.pages.LoginPage;
import com.rootcode.hrm.pages.LandingPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class loginTest extends hrmBaseTest{

    private ChromeDriver driver;

    @BeforeMethod
    public void beforeMethod(){
        driver = new ChromeDriver();
        driver.get("http://hrm.pragmatictestlabs.com/");
    }

    @AfterMethod
    public  void afterMethod(){
        if (driver!=null){
            driver.quit();
        }

    }
    @Test

    public void loginWithValidCredentials (){

        LoginPage loginPage = new LoginPage(driver);
        loginPage.typeUserName("Admin").typePassword("Ptl@#321").clickLogin();

        LandingPage landingPage=new LandingPage(driver);
        assertThat(landingPage.getWelcomeMsg()).isEqualTo("Welcome Admin");

    }

    @Test
    public void loginWithInvalidCredentials () throws IOException {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.typeUserName("Admin").typePassword("Test@123").clickLogin();

        assertThat(loginPage.getError()).isEqualTo("Invalid credentials");

    }




}
