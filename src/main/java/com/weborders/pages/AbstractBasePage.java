package com.weborders.pages;

import com.sun.org.apache.xalan.internal.xsltc.dom.AdaptiveResultTreeImpl;
import com.weborders.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

//it meant to be extended
public abstract class AbstractBasePage {
    protected WebDriver driver=Driver.getDriver();
    protected WebDriverWait wait=new WebDriverWait(driver,20);

    @FindBy(tagName = "h1")
    protected WebElement pageLogo;

    public String getPageLogoTest(){
        return pageLogo.getText();
    }

    public AbstractBasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
