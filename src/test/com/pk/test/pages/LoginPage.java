package com.pk.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(how = How.NAME, using = "userName")
    public WebElement txtUserName;

    @FindBy(how = How.NAME, using = "password")
    public WebElement txtPassword;

    @FindBy(how = How.NAME, using = "login")
    public WebElement btnLogin;


    public void login(String userName, String password) {

        txtUserName.sendKeys(userName);
        txtPassword.sendKeys(password);
        btnLogin.submit();

    }
}
