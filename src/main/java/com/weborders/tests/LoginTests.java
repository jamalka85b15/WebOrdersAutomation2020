package com.weborders.tests;


import com.weborders.pages.LoginPage;
import org.testng.Assert.*;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class LoginTests extends AbstractBaseTest {


    @Test
    public void login(){
        extentTest=extentReports.createTest("Verify page logo");

        LoginPage loginPage=new LoginPage();
        loginPage.login();
        assertEquals(loginPage.getPageLogoTest(),"Web Orders");

        extentTest.pass("Logo verified");

    }
}
