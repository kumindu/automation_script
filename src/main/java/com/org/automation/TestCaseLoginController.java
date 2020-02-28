package com.org.automation;

import com.org.automation.component.LoginComponent;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TestCaseLoginController {


    private LoginComponent loginComponent;
    private WebDriver driver;
    private String baseUrl;



    public TestCaseLoginController(WebDriver driver){
        super();
        this.driver         = driver;
        this.loginComponent = new LoginComponent(driver);
    }

    public String PageHeaderCheck(){
		try {
		   String val = "" + loginComponent.getMainHeaderText() + ","
		                   + loginComponent.getLoginHeaderText() + ","
				           + loginComponent.getRegisterHeaderText();
		   Thread.sleep(3000);
		   return val;
		} catch (InterruptedException ex) {
			Logger.getLogger(TestCaseLoginController.class.getName()).log(Level.SEVERE, null, ex);
		}
		   return null;
    }

	public String EmptyUserName(){
          try {
            Thread.sleep(3000);
            driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
            loginComponent.setInputUsername("");
            driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
            loginComponent.setInputPassword("Kumindu");
            driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
            loginComponent.actionCheck();
            driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
            loginComponent.actionButton();
            driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
            String val = loginComponent.getEmailValidate();
            Thread.sleep(3000);
            return val;
          } catch (InterruptedException ex) {
            Logger.getLogger(TestCaseLoginController.class.getName()).log(Level.SEVERE, null, ex);
          }
          return null;
	}

	public String EmptyPassword(){
		try {
			Thread.sleep(3000);
		    driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		    loginComponent.setInputUsername("kumindu.induranga.win20@gmail.com");
		    driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		    loginComponent.setInputPassword("");
		    driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		    loginComponent.actionCheck();
		    driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		    loginComponent.actionButton();
		    driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			String val = loginComponent.getPasswordValidate();
			Thread.sleep(3000);
			return val;
		} catch (InterruptedException ex) {
			Logger.getLogger(TestCaseLoginController.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}

	public String InCorrectUserName(){
		try {
			Thread.sleep(3000);
		    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		    loginComponent.setInputUsername("kumindu.indurana.win@gmail.com");
		    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		    loginComponent.setInputPassword("Kumindu2020");
		    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		    loginComponent.actionCheck();
		    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		    loginComponent.actionButton();
			String val = loginComponent.getErrorText();
			Thread.sleep(3000);
			return val;
		} catch (InterruptedException ex) {
			Logger.getLogger(TestCaseLoginController.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}

	public String InCorrectPassword(){
		try {
			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			loginComponent.setInputUsername("kumindu.induranga.win20@gmail.com");
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			loginComponent.setInputPassword("Kumindu202");
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			loginComponent.actionCheck();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			loginComponent.actionButton();
			String val = loginComponent.getErrorText();
			Thread.sleep(3000);
			return val;
		} catch (InterruptedException ex) {
			Logger.getLogger(TestCaseLoginController.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}

    public String CorrectUserName(){
    	try {
    		Thread.sleep(3000);
    		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    		loginComponent.setInputUsername("kumindu.induranga.win20@gmail.com");
    		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
    		loginComponent.setInputPassword("Kumindu2020");
    		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
    		loginComponent.actionCheck();
    		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
    		loginComponent.actionButton();
			String val = driver.getCurrentUrl();
			Thread.sleep(2000);
			return val;
    	} catch (InterruptedException ex) {
    		Logger.getLogger(TestCaseLoginController.class.getName()).log(Level.SEVERE, null, ex);
    	}
    	 return null;
    }




}
