package com.pk.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import pk.framework.base.Base;

public class LoginPage extends Base {

  public LoginPage(WebDriver driver) {
      super(driver);
  }

    @FindBy(how = How.NAME, using = "UserName")
    public WebElement txtUserName;

    @FindBy(how = How.NAME, using = "Password")
    public WebElement txtPassword;

    @FindBy(how = How.XPATH, using = "//input[@class='btn btn-default']")
    public WebElement btnLogin;


    public void login(String userName, String password) {

        txtUserName.sendKeys(userName);
        txtPassword.sendKeys(password);
        btnLogin.submit();

    }
}
