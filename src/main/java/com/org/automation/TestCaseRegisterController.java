package com.org.automation;

import com.org.automation.component.RegisterComponent;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestCaseRegisterController {


    private RegisterComponent registerComponent;
    private WebDriver driver;
    private String baseUrl;

    public TestCaseRegisterController(WebDriver driver){
        super();
		this.driver            = driver;
        this.registerComponent = new RegisterComponent(driver);
    }

	public String EmptyName(){
		try {
			Thread.sleep(3000);
			String randomString=RandomStringUtils.randomAlphabetic(20);
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			registerComponent.setInputname("");
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			registerComponent.setInputUsername(randomString+"@gmail.com");
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			registerComponent.setInputPassword("Kumindu2020");
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			registerComponent.setInputConfirmPassword("Kumindu2020");
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			registerComponent.actionButton();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			String val = registerComponent.getNameValidate();
			Thread.sleep(3000);
			driver.quit();
			return val;
		} catch (InterruptedException ex) {
			Logger.getLogger(TestCaseLoginController.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}

	public String EmptyEmail(){
		try {
			Thread.sleep(3000);
			String randomString=RandomStringUtils.randomAlphabetic(20);
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			registerComponent.setInputname(randomString);
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			registerComponent.setInputUsername("");
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			registerComponent.setInputPassword("Kumindu2020");
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			registerComponent.setInputConfirmPassword("Kumindu2020");
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			registerComponent.actionButton();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			String val = registerComponent.getEmailValidate();
			Thread.sleep(3000);
			driver.quit();
			return val;
		} catch (InterruptedException ex) {
			Logger.getLogger(TestCaseLoginController.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}

	public String isEmail(){
		try {
			Thread.sleep(3000);
			String randomString=RandomStringUtils.randomAlphabetic(20);
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			registerComponent.setInputname(randomString);
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			registerComponent.setInputUsername(randomString);
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			registerComponent.setInputPassword("Kumindu2020");
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			registerComponent.setInputConfirmPassword("Kumindu2020");
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			registerComponent.actionButton();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			String val =  registerComponent.getEmailValidate();
			Thread.sleep(3000);
			driver.quit();
			return val;
		} catch (InterruptedException ex) {
			Logger.getLogger(TestCaseLoginController.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}

	public String CorrectUserName(){
		try {
			Thread.sleep(3000);
			String randomString=RandomStringUtils.randomAlphabetic(20);
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			registerComponent.setInputname(randomString);
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			registerComponent.setInputUsername(randomString+"@gmail.com");
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			registerComponent.setInputPassword("Kumindu2020");
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			registerComponent.setInputConfirmPassword("Kumindu2020");
			driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
			registerComponent.actionButton();
			String val = driver.getCurrentUrl();
			Thread.sleep(2000);
			driver.quit();
			return val;
		} catch (InterruptedException ex) {
			Logger.getLogger(TestCaseLoginController.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}

	public String EmptyPassword(){
		try {
			Thread.sleep(3000);
			String randomString=RandomStringUtils.randomAlphabetic(20);
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			registerComponent.setInputname(randomString);
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			registerComponent.setInputUsername(randomString+"@gmail.com");
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			registerComponent.setInputPassword("");
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			registerComponent.setInputConfirmPassword("Kumindu2020");
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			registerComponent.actionButton();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			String val = registerComponent.getPasswordValidate();
			Thread.sleep(3000);
			driver.quit();
			return val;
		} catch (InterruptedException ex) {
			Logger.getLogger(TestCaseLoginController.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}

	public String EmptyConfirmPassword(){
		try {
			Thread.sleep(3000);
			String randomString=RandomStringUtils.randomAlphabetic(20);
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			registerComponent.setInputname(randomString);
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			registerComponent.setInputUsername(randomString+"@gmail.com");
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			registerComponent.setInputPassword("Kumindu2020");
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			registerComponent.setInputConfirmPassword("");
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			registerComponent.actionButton();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			String val = registerComponent.getPasswordValidate();
			Thread.sleep(3000);
			driver.quit();
			return val;
		} catch (InterruptedException ex) {
			Logger.getLogger(TestCaseLoginController.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}

	public String EmailAlreadyTaken(){
		try {
			Thread.sleep(3000);
			String randomString=RandomStringUtils.randomAlphabetic(20);
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			registerComponent.setInputname(randomString);
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			registerComponent.setInputUsername("kumindu.induranga.win@gmail.com");
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			registerComponent.setInputPassword("Kumindu2020");
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			registerComponent.setInputConfirmPassword("Kumindu2020");
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			registerComponent.actionButton();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			String val = registerComponent.getErrorText(0);
			Thread.sleep(3000);
			driver.quit();
			return val;
		} catch (InterruptedException ex) {
			Logger.getLogger(TestCaseLoginController.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}

	public String PasswordValidation(){
		try {
			Thread.sleep(3000);
			String randomString=RandomStringUtils.randomAlphabetic(20);
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			registerComponent.setInputname(randomString);
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			registerComponent.setInputUsername(randomString+"@gmail.com");
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			registerComponent.setInputPassword("Kum");
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			registerComponent.setInputConfirmPassword("Kum");
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			registerComponent.actionButton();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			String val = registerComponent.getErrorText(0);
			Thread.sleep(3000);
			driver.quit();
			return val;
		} catch (InterruptedException ex) {
			Logger.getLogger(TestCaseLoginController.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}

	public String ConfirmPasswordNotMatched(){
		try {
			Thread.sleep(3000);
			String randomString=RandomStringUtils.randomAlphabetic(20);
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			registerComponent.setInputname(randomString);
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			registerComponent.setInputUsername(randomString+"@gmail.com");
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			registerComponent.setInputPassword("Kumindu2020");
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			registerComponent.setInputConfirmPassword("Kumindu2021");
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			registerComponent.actionButton();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			String val = registerComponent.getErrorText(0);
			Thread.sleep(3000);
			driver.quit();
			return val;
		} catch (InterruptedException ex) {
			Logger.getLogger(TestCaseLoginController.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}

	public String ConfirmPasswordNotMatchedAndEmailAlreadyTaken(){
		try {
			Thread.sleep(3000);
			String randomString=RandomStringUtils.randomAlphabetic(20);
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			registerComponent.setInputname(randomString);
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			registerComponent.setInputUsername("kumindu.induranga.win20@gmail.com");
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			registerComponent.setInputPassword("Kumindu2020");
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			registerComponent.setInputConfirmPassword("Kumindu2021");
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			registerComponent.actionButton();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			String val = registerComponent.getErrorText(0) + "," +
					     registerComponent.getErrorText(1);
			Thread.sleep(3000);
			driver.quit();
			return val;
		} catch (InterruptedException ex) {
			Logger.getLogger(TestCaseLoginController.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}




}
