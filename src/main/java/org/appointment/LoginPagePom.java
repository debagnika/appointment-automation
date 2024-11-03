package org.appointment;

import org.apache.commons.logging.Log;
import org.appointment.driver.DriverManagerTL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class LoginPagePom extends CommonToAllTest {
    private static final Logger logger = LoggerFactory.getLogger(LoginPagePom.class);

    public LoginPagePom(){
        super();
    }

    public void openURL(String url){
        DriverManagerTL.getDriver().get(url);
    }
    public String loginPageTest() throws Exception {
        List<WebElement> userNameElement = DriverManagerTL.getDriver().findElements(By.xpath("//input[@placeholder='Username']"));
        String userName = userNameElement.get(0).getAttribute("value");
        userNameElement.get(1).click();
        userNameElement.get(1).sendKeys(userName);
        Thread.sleep(3000);
        logger.info(userName);
        return  userName;
    }


    public void openLoginPAge() throws Exception{
        DriverManagerTL.getDriver().findElement(By.id("btn-make-appointment")).click();

    }
}
