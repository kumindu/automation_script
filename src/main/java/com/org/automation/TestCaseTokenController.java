package com.org.automation;

import com.org.automation.component.LoginComponent;
import com.org.automation.component.TokenComponent;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestCaseTokenController {

	private LoginComponent loginComponent;
    private TokenComponent tokenComponent;
    private WebDriver driver;
    private String baseUrl;


    public TestCaseTokenController(WebDriver driver){
        super();
        this.driver         = driver;
		this.loginComponent = new LoginComponent(driver);
    }

	public Boolean CreateClientTokenWithOutRedirect(){
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
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			Thread.sleep(3000);
			this.tokenComponent = new TokenComponent(driver);
			tokenComponent.actionCreateClientModel();
			Thread.sleep(3000);
			tokenComponent.setInputclientname("test");
			tokenComponent.setInputredirect("");
			tokenComponent.actionCreateClient();
			Boolean val=tokenComponent.getError();
			Thread.sleep(3000);
			return val;
		} catch (InterruptedException ex) {
			Logger.getLogger(TestCaseLoginController.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}

	public Boolean CreateClientTokenWithOutName(){
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
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			Thread.sleep(3000);
			this.tokenComponent = new TokenComponent(driver);
			tokenComponent.actionCreateClientModel();
			Thread.sleep(3000);
			tokenComponent.setInputclientname("");
			tokenComponent.setInputredirect("http://localhost:8000");
			tokenComponent.actionCreateClient();
			Boolean val=tokenComponent.getError();
			Thread.sleep(3000);
			return val;
		} catch (InterruptedException ex) {
			Logger.getLogger(TestCaseLoginController.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}

	public Boolean CreateClientTokenWithOutNameAndRedirect(){
		try {
			Thread.sleep(3000);
			loginComponent.setInputUsername("kumindu.induranga.win20@gmail.com");
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			loginComponent.setInputPassword("Kumindu2020");
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			loginComponent.actionCheck();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			loginComponent.actionButton();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			Thread.sleep(3000);
			this.tokenComponent = new TokenComponent(driver);
			tokenComponent.actionCreateClientModel();
			Thread.sleep(3000);
			tokenComponent.setInputclientname("");
			tokenComponent.setInputredirect("");
			tokenComponent.actionCreateClient();
			Boolean val=tokenComponent.getError();
			Thread.sleep(3000);
			return val;
		} catch (InterruptedException ex) {
			Logger.getLogger(TestCaseLoginController.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}

	public Boolean CreateClientTokenCorrect(){
		try {
			String randomString= RandomStringUtils.randomAlphabetic(20);
			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			loginComponent.setInputUsername("kumindu.induranga.win20@gmail.com");
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			loginComponent.setInputPassword("Kumindu2020");
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			loginComponent.actionCheck();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			loginComponent.actionButton();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			Thread.sleep(3000);
			this.tokenComponent = new TokenComponent(driver);
			tokenComponent.actionCreateClientModel();
			Thread.sleep(3000);
			tokenComponent.setInputclientname(randomString);
			tokenComponent.setInputredirect("http://localhost:8000");
			tokenComponent.actionCreateClient();
			Thread.sleep(3000);
			return true;
		} catch (InterruptedException ex) {
			Logger.getLogger(TestCaseLoginController.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}

	public Boolean CreateTokenWithOutName(){
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
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			Thread.sleep(3000);
			this.tokenComponent = new TokenComponent(driver);
			tokenComponent.actionCreateTokenModel();
			Thread.sleep(3000);
			tokenComponent.setInputtokenname("");
			tokenComponent.actionCreateToken();
			Boolean val=tokenComponent.getError();
			Thread.sleep(3000);
			return val;
		} catch (InterruptedException ex) {
			Logger.getLogger(TestCaseLoginController.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}

	public Boolean CreateTokenCorrect(){
		try {
			String randomString= RandomStringUtils.randomAlphabetic(20);
			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			loginComponent.setInputUsername("kumindu.induranga.win20@gmail.com");
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			loginComponent.setInputPassword("Kumindu2020");
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			loginComponent.actionCheck();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			loginComponent.actionButton();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			Thread.sleep(3000);
			this.tokenComponent = new TokenComponent(driver);
			tokenComponent.actionCreateTokenModel();
			Thread.sleep(3000);
			tokenComponent.setInputtokenname(randomString);
			tokenComponent.actionCreateToken();
			Thread.sleep(3000);
			return true;
		} catch (InterruptedException ex) {
			Logger.getLogger(TestCaseLoginController.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}



}
