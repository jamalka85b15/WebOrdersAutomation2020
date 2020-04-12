package com.weborders.pages;

import com.weborders.utilities.BrowserUtilities;
import com.weborders.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends AbstractBasePage {

    @FindBy(id="ctl00_MainContent_username")
    private WebElement username;

    @FindBy(id="ctl00_MainContent_password")
    private WebElement password;

    public void login(){
        BrowserUtilities.wait(3);
        String userNameValue= ConfigurationReader.getProperty("username");
        String passwordValue=ConfigurationReader.getProperty("password");
        username.sendKeys(userNameValue);
        password.sendKeys(passwordValue, Keys.ENTER);
    }
    public void login(String userNameValue, String passwordValue){
        BrowserUtilities.wait(3);
        username.sendKeys(userNameValue);
        password.sendKeys(passwordValue, Keys.ENTER);
    }


}
