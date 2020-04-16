package com.pk.test.test;

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
        driver.get("http://newtours.demoaut.com/mercurywelcome.php");
    }



    @Test
    public void loginTest() {
        LoginPage login = new LoginPage(driver);
        login.login("admin", "admin");

        System.out.println(System.getProperty("user.dir"));
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
