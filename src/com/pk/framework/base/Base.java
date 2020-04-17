package pk.framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

 public abstract class Base {

     public Base(WebDriver driver) {
         PageFactory.initElements(driver, this);
     }

}
