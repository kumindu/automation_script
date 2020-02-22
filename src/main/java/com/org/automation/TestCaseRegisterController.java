package com.org.automation;

import com.org.automation.component.LoginComponent;
import com.org.automation.component.RegisterComponent;
import com.org.automation.util.WebDrivers;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class TestCaseRegisterController {


    private RegisterComponent registerComponent;
    private WebDriver driver;
    private String baseUrl;

    public TestCaseRegisterController(){
        super();
        this.driver            = new WebDrivers().getDriver("CH",8.0,false);
        this.registerComponent = new RegisterComponent(driver);
    }


    public void start(){
        System.out.println(registerComponent.getMainHeaderText());
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        System.out.println(registerComponent.getLoginHeaderText());
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        System.out.println(registerComponent.getRegisterHeaderText());
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        registerComponent.setInputname("Kumindu Ranawakas");
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        registerComponent.setInputUsername("kumindu.induranga.win20@gmail.com");
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        registerComponent.setInputPassword("Kumindu2020");
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        registerComponent.setInputConfirmPassword("Kumindu2020");
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        registerComponent.actionButton();
        //driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        //System.out.println(registerComponent.getPasswordValidate());
        System.out.println(registerComponent.getErrorText(0));
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        System.out.println(registerComponent.getErrorText(1));

    }
}
