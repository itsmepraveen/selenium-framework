package com.pk.test.test;

import com.pk.test.pages.HomePage;
import com.pk.test.pages.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Login {

    private WebDriver driver = null;

    @Before
    public void initialize() {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/com/pk/framework/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://eaapp.somee.com/");
    }



    @Test
    public void loginTest() throws InterruptedException {
        HomePage home = new HomePage(driver);
        home.gotoLogin();

        Thread.sleep(2000);
        LoginPage login = new LoginPage(driver);
        login.login("admin", "password");

    }

    @After
    public void tearDown() {
       // driver.quit();
    }
}
