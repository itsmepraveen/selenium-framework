package com.pk.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pk.framework.base.Base;

public class HomePage extends Base {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.LINK_TEXT, using = "Login")
    public WebElement lnkHome;

    public void gotoLogin() {
        lnkHome.click();
    }
}
