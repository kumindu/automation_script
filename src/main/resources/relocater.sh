#!/bin/bash
echo  "####################################################################\n"
echo  "          Automation web driver relocater  && Deployer              \n"
echo  "####################################################################\n"
echo  "@Author Kumindu Induranga Ranawaka             @Relase Date:29/02/18\n"
echo  "####################################################################\n"
echo
read -p 'Enter web driver relocating path (Default:/opt/resources/)[ENTER]:' path
if [ ! -z $path ]; then
	if [ -d $path ]; then
    if [ -d $path/chrome ]; then
    	 echo
    	 echo Current directory $path/resources/chrome content:
     	 ls $path/chrome
     	 echo
       read -p 'Chrome driver is loacted are you need relocating again?[Y/N]:' yn
       case $yn in
          [Yy]* ) sudo rm -r $path/chrome;sudo cp -R chrome $path/;;
          [Nn]* ) ;;
       *)
       esac
    else
    	sudo cp -R chrome $path/
    fi
    if [ -d  $path/edge ]; then
    	 echo
    	 echo Current directory $path/resources/edge content:
     	 ls  $path/edge
     	 echo
       read -p 'Edge driver is loacted are you need relocating again?[Y/N]:' yn
       case $yn in
          [Yy]* ) sudo rm -r $path/edge;sudo cp -R edge $path/;;
          [Nn]* ) ;;
       *)
       esac
    else
    	sudo cp -R edge $path/
    fi
    if [ -d  $path/firefox ]; then
    	 echo
    	 echo Current directory $path/resources/firefox content:
     	 ls  $path/firefox
     	 echo
       read -p 'Firefox driver is loacted are you need relocating again?[Y/N]:' yn
       case $yn in
          [Yy]* ) sudo rm -r  $path/firefox;sudo cp -R firefox $path/;;
          [Nn]* ) ;;
       *)
       esac
    else
    	sudo cp -R firefox $path/
    fi
    if [ -d  $path/IE ]; then
    	 echo
    	 echo Current directory $path/resources/Internet Explora content:
     	 ls  $path/IE
     	 echo
       read -p 'Internet Explora driver is loacted are you need relocating again?[Y/N]:' yn
       case $yn in
          [Yy]* ) sudo rm -r  $path/IE ;sudo cp -R IE $path/;;
          [Nn]* ) ;;
       *)
       esac
    else
    	sudo cp -R IE $path/
    fi
    if [ -d  $path/opera ]; then
    	 echo
    	 echo 'Current directory $path/resources/opera content:'
     	 ls  $path/opera
     	 echo
       read -p 'Opera driver is loacted are you need relocating again?[Y/N]:' yn
       case $yn in
          [Yy]* ) sudo rm -r  $path/opera ;sudo cp -R opera $path/;;
          [Nn]* ) ;;
       *)
       esac
    else
    	sudo cp -R opera $path/
    fi
    JavaTestCodeFile $path
  else
  	sudo cp -R * $path
    echo 'Web Driver files are relocated to:'.$path
    echo
    ls $path
    echo
    echo 'Example java code for application:'
    JavaTestCodeFile $path
   fi
else
  if [ -d /opt/resources/ ]; then
    if [ -d /opt/resources/chrome ]; then
    	 echo
    	 echo 'Current directory /opt/resources/chrome content:'
     	 ls /opt/resources/chrome
     	 echo
       read -p 'Chrome driver is loacted are you need relocating again?[Y/N]:' yn
       case $yn in
          [Yy]* ) sudo rm -r /opt/resources/chrome ;sudo cp -R chrome /opt/resources/;;
          [Nn]* ) ;;
       *)
       esac
    fi
    if [ -d /opt/resources/edge ]; then
     	 echo
    	 echo 'Current directory /opt/resources/edge content:'
     	 ls /opt/resources/edge
     	 echo
       read -p 'Edge driver is loacted are you need relocating again?[Y/N]:' yn
       case $yn in
          [Yy]* ) sudo rm -r /opt/resources/edge ;sudo cp -R edge /opt/resources/;;
          [Nn]* ) ;;
       *)
       esac
    fi
    if [ -d /opt/resources/firefox ]; then
     	 echo
    	 echo 'Current directory /opt/resources/firefox content:'
     	 ls /opt/resources/firefox
     	 echo
       read -p 'Firefox driver is loacted are you need relocating again?[Y/N]:' yn
       case $yn in
          [Yy]* ) sudo rm -r /opt/resources/firefox ;sudo cp -R firefox /opt/resources/;;
          [Nn]* ) ;;
       *)
       esac
    fi
    if [ -d /opt/resources/IE ]; then
     	 echo
    	 echo 'Current directory /opt/resources/IE content:'
     	 ls /opt/resources/IE
     	 echo
       read -p 'Internet Explora driver is loacted are you need relocating again?[Y/N]:' yn
       case $yn in
          [Yy]* ) sudo rm -r /opt/resources/IE ;sudo cp -R IE /opt/resources/;;
          [Nn]* ) ;;
       *)
       esac
    fi
    if [ -d /opt/resources/opera ]; then
     	 echo
    	 echo 'Current directory /opt/resources/opera content:'
     	 ls /opt/resources/opera
     	 echo
       read -p 'Opera driver is loacted are you need relocating again?[Y/N]:' yn
       case $yn in
          [Yy]* ) sudo rm -r /opt/resources/opera ;sudo cp -R opera /opt/resources/;;
          [Nn]* ) ;;
       *)
       esac
    fi
  else
    sudo mkdir /opt/resources
    sudo cp -R * /opt/resources/
    echo 'Web Driver files are relocated to /opt/resources/'
    echo
    ls $path
    echo
    echo 'Example java code for application:'
    JavaTestCodeFile $path
  fi
fi
echo
echo  "####################################################################\n"
echo  "                          version 1.0                               \n"
echo  "####################################################################\n"
JavaTestCodeFile(){
	cat > AutomationJUnitTest.java <<EOF
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
		driver = new WebDrivers("Lnx",$path).getDriver("CH",8.0,false);
		driver.manage().window().maximize();
	}
	@After
	public void tearDown() {
		driver.quit();
	}

	//User Login Test Cases
	@Test
	public void EmptyUserName() {
		System.out.println(new TestCaseLoginController(driver).EmptyUserName());
	}
	@Test
	public void loginMenuCheck() {
		System.out.println(new TestCaseLoginController(driver).PageHeaderCheck());
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
	public void ConfirmPasswordNotMatched() {
		System.out.println(new TestCaseRegisterController(driver).ConfirmPasswordNotMatched());
	}
	@Test
	public void ConfirmPasswordNotMatchedAndEmailAlreadyTaken() {
		System.out.println(new TestCaseRegisterController(driver).ConfirmPasswordNotMatchedAndEmailAlreadyTaken());
	}
	@Test
	public void isEmail() {
		System.out.println(new TestCaseRegisterController(driver).isEmail());
	}
	@Test
	public void EmptyName() {
		System.out.println(new TestCaseRegisterController(driver).EmptyName());
	}
	@Test
	public void EmptyEmail() {
		System.out.println(new TestCaseRegisterController(driver).EmptyEmail());
	}
	@Test
	public void EmptyPassword() {
		System.out.println(new TestCaseRegisterController(driver).EmptyPassword());
	}
	@Test
	public void EmailAlreadyTaken() {
		System.out.println(new TestCaseRegisterController(driver).EmailAlreadyTaken());
	}
	@Test
	public void PasswordValidation() {
		System.out.println(new TestCaseRegisterController(driver).PasswordValidation());
	}
	@Test
	public void RegisterCorrectUserName() {
		System.out.println(new TestCaseRegisterController(driver).CorrectUserName());
	}

	//User Create Token
	@Test
	public void CreateTokenWithOutName() {
		System.out.println(new TestCaseTokenController(driver).CreateTokenWithOutName());
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
	public void CreateTokenCorrect() {
		assert (new TestCaseTokenController(driver).CreateTokenCorrect());
	}
	@Test
	public void CreateClientTokenCorrect() {
		assert(new TestCaseTokenController(driver).CreateClientTokenCorrect());
	}
}

	...
	EOF
}
exit 1
