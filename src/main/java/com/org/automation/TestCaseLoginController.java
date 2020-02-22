package com.org.automation;

import org.openqa.selenium.support.ui.WebDriverWait;
import com.org.automation.component.LoginComponent;
import com.org.automation.util.WebDrivers;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class TestCaseLoginController {


    private LoginComponent loginComponent;
    private WebDriver driver;
    private String baseUrl;


    public TestCaseLoginController(){
        super();
        this.driver         = new WebDrivers().getDriver("CH",8.0,false);
        this.loginComponent = new LoginComponent(driver);
    }

    public void start(){
        System.out.println(loginComponent.getMainHeaderText());
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        System.out.println(loginComponent.getLoginHeaderText());
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        System.out.println(loginComponent.getRegisterHeaderText());
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        loginComponent.setInputUsername("kumindu.induranga.win20@gmail.com");
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        loginComponent.setInputPassword("Kumindu2020");
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        loginComponent.actionCheck();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        loginComponent.actionButton();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        System.out.println(loginComponent.getPasswordValidate());

    }
}
