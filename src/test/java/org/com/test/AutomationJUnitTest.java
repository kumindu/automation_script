/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.com.test;

import com.org.automation.TestCaseLoginController;
import com.org.automation.TestCaseRegisterController;
import com.org.automation.TestCaseTokenController;
import com.org.automation.util.WebDrivers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


/**
 *
 * @author Kumindu Induranga Ranawaka
 */
public class AutomationJUnitTest {
	private WebDriver driver;
	@Before
	public void setUp() {
		driver = new WebDrivers().getDriver("CH",8.0,false);
		driver.manage().window().maximize();
	}
	@After
	public void tearDown() {
		driver.quit();
	}

	//User Login Test Cases
	@Test
	public void loginMenuCheck() {
		System.out.println(new TestCaseLoginController(driver).PageHeaderCheck());
	}

	@Test
	public void EmptyUserName() {
		System.out.println(new TestCaseLoginController(driver).EmptyUserName());
	}

	@Test
	public void InCorrectUserName() {
		System.out.println(new TestCaseLoginController(driver).InCorrectUserName());
	}

	@Test
	public void InCorrectPassword() {
		System.out.println(new TestCaseLoginController(driver).InCorrectPassword());
	}

	@Test
	public void LoginCorrectUserName() {
		System.out.println(new TestCaseLoginController(driver).CorrectUserName());
	}

	//User Registation Test Cases
	@Test
	public void ConfirmPasswordNotMatchedAndEmailAlreadyTaken() {
		System.out.println(new TestCaseRegisterController(driver).ConfirmPasswordNotMatchedAndEmailAlreadyTaken());
	}

	@Test
	public void ConfirmPasswordNotMatched() {
		System.out.println(new TestCaseRegisterController(driver).ConfirmPasswordNotMatched());
	}

	@Test
	public void PasswordValidation() {
		System.out.println(new TestCaseRegisterController(driver).PasswordValidation());
	}

	@Test
	public void EmailAlreadyTaken() {
		System.out.println(new TestCaseRegisterController(driver).EmailAlreadyTaken());
	}

	@Test
	public void EmptyPassword() {
		System.out.println(new TestCaseRegisterController(driver).EmptyPassword());
	}

	@Test
	public void EmptyEmail() {
		System.out.println(new TestCaseRegisterController(driver).EmptyEmail());
	}

	@Test
	public void EmptyName() {
		System.out.println(new TestCaseRegisterController(driver).EmptyName());
	}

	@Test
	public void isEmail() {
		System.out.println(new TestCaseRegisterController(driver).isEmail());
	}

	@Test
	public void RegisterCorrectUserName() {
		System.out.println(new TestCaseRegisterController(driver).CorrectUserName());
	}


	//User Create Token

	@Test
	public void CreateClientTokenCorrect() {
		assert(new TestCaseTokenController(driver).CreateClientTokenCorrect());
	}

	@Test
	public void CreateClientTokenWithOutName(){
		System.out.println(new TestCaseTokenController(driver).CreateClientTokenWithOutName());
	}


	@Test
	public void CreateClientTokenWithOutRedirect() {
		System.out.println(new TestCaseTokenController(driver).CreateClientTokenWithOutRedirect());
	}

	@Test
	public void CreateClientTokenWithOutNameAndRedirect() {
		System.out.println(new TestCaseTokenController(driver).CreateClientTokenWithOutNameAndRedirect());
	}


	@Test
	public void CreateTokenWithOutName() {
		System.out.println(new TestCaseTokenController(driver).CreateTokenWithOutName());
	}

	@Test
	public void CreateTokenCorrect() {
		assert (new TestCaseTokenController(driver).CreateTokenCorrect());
	}

}
