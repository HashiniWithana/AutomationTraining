package com.rootcode.hrm.testCases;

import com.github.javafaker.Faker;
import com.rootcode.hrm.pages.AddEmpPage;
import com.rootcode.hrm.pages.MenuPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddEmployeeTest extends hrmBaseTest{

    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.get("http://hrm.pragmatictestlabs.com");
        super.login(driver);
        MenuPage menuPage = new MenuPage(driver);
        menuPage.navigateToAddEmpPage();
    }

    @AfterMethod

    public void afterMethod(){
        if(driver!=null){
            driver.quit();
        }
    }

    @Test
    public void addEmpInformation(){
        AddEmpPage addEmpPage=new AddEmpPage(driver);
        addEmpPage.typeFirstName("Hashini")
                .typeLastName("Withana")
                .clickSave();

    }

    @Test
    public void addEmpPic(){
        Faker faker=new Faker();
        String firstName=faker.name().firstName();
        String lastName=faker.name().lastName();

        AddEmpPage addEmpPage=new AddEmpPage(driver);
        addEmpPage.typeFirstName(firstName).typeLastName(lastName)
                .uploadProfPic("C:\\Hashini\\rootcodelabs-java\\src\\main\\resources\\profilePic\\sample-profile-picture.png")
                .clickSave();

    }

    @Test()
    public void addEmployeeWithLoginCredentials(){
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String userName = String.format("%s.%s", firstName, lastName);
        String password = "Ptl@#321";


        AddEmpPage addEmployeePage = new AddEmpPage(driver);
        addEmployeePage.typeFirstName(firstName)
                .typeLastName(lastName)
                .checkLoginCredentials()
                .typeUsername(userName)
                .typePassword(password)
                .typeRePassword(password)
                .selectStatus("Enabled")
                .clickSave();



    }



}
