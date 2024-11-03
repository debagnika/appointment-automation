package org.appointement.appointment;

import org.appointment.CommonToAllTest;
import org.appointment.LoginPagePom;
import org.appointment.driver.DriverManagerTL;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginPage extends CommonToAllTest {

    @Test(priority = 1)
    public void runLoginTest() throws Exception {
        System.out.println("Hello world!");

        // Create an instance of LoginPagePom, which extends CommonToAllTest
        LoginPagePom loginPom = new LoginPagePom();

        // Open the URL using the method defined in LoginPagePom
        loginPom.openURL("https://katalon-demo-cura.herokuapp.com/");
        loginPom.openLoginPAge();
        Thread.sleep(3000);
        // Execute your login logic (assuming loginPageTest() is defined in LoginPagePom)
        String username = loginPom.loginPageTest();
        DriverManagerTL.getDriver().findElement(By.xpath("//input[@placeholder='Username'][2]")).click();
        Thread.sleep(3000);

        // Optionally print or assert the username returned from the login
        System.out.println("Logged in username: " + username);
    }
}
