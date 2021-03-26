/*
 * Copyright (C) 2020 Kumindu Ranawaka
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.org.automation.component;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterComponent {

    private WebDriver driver;
	public String currentUrl;
    private WebElement inputName;
    private WebElement buttonLogin;
    private WebElement errorMessage;
    private WebElement inputUsername;
    private WebElement inputPassword;
    private WebElement checkRemember;
    private WebElement menuMainheader;
    private WebElement menuLoginheader;
    private WebElement menuRegisterheader;
    private WebElement inputConfirmPassword;

    public RegisterComponent(WebDriver driver) {
        super();
        this.driver               = driver;
        this.currentUrl           = this.Navigation();
        this.inputName            = driver.findElement(By.id("name"));
        this.menuLoginheader      = driver.findElement(By.linkText("Login"));
        this.menuRegisterheader   = driver.findElement(By.linkText("Register"));
        this.buttonLogin          = driver.findElement(By.className("btn-primary"));
        this.menuMainheader       = driver.findElement(By.className("navbar-brand"));
        this.inputUsername        = driver.findElement(By.xpath("//input[@id='email']"));
        this.inputPassword        = driver.findElement(By.xpath("//input[@id='password']"));
        this.inputConfirmPassword = driver.findElement(By.xpath("//input[@id='password-confirm']"));
    }

    public String Navigation() {
        driver.get("http://127.0.0.1:8000/register");
        return driver.getCurrentUrl();
    }

    public String getErrorText(int i){
        return driver.findElements(By.cssSelector("span.invalid-feedback strong")).get(i).getText();
    }

    public void actionButton(){
        buttonLogin.click();
    }

    public String getButtonText(){
        return buttonLogin.getText();
    }

    public String getInputUsername(){
        return inputUsername.getText();
    }

    public String getInputPassword(){
        return inputPassword.getText();
    }

    public String getMainHeaderText(){
        return menuMainheader.getText();
    }

    public String getLoginHeaderText(){
        return menuLoginheader.getText();
    }

    public void setInputname(String name){
        this.inputName.sendKeys(name);
    }

    public String getRegisterHeaderText(){
        return menuRegisterheader.getText();
    }

    public void setInputPassword(String password){
        this.inputPassword.sendKeys(password);
    }

    public void setInputUsername(String username){
        this.inputUsername.sendKeys(username);
    }

	public String getNameValidate(){
		return inputUsername.getAttribute("validationMessage");
	}

	public String getConfirmValidate(){
		return inputPassword.getAttribute("validationMessage");
	}

    public String getEmailValidate(){
        return inputUsername.getAttribute("validationMessage");
    }

    public String getPasswordValidate(){
        return inputPassword.getAttribute("validationMessage");
    }


    public void setInputConfirmPassword(String ConfirmPassword){
        this.inputConfirmPassword.sendKeys(ConfirmPassword);
    }

}
