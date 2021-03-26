package com.org.automation.component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TokenComponent {

	private WebElement alert;
    private WebDriver driver;
    private String currentUrl;
    private WebElement redirect;
    private WebElement errorMessage;
    private WebElement accesstokenbtn;
    private WebElement createNewToken;
    private WebElement createnewclient;
    private WebElement createtokenname;
    private WebElement createclientbtn;
    private WebElement createclientname;

   

    public TokenComponent(WebDriver driver) {
        super();
        this.driver             = driver;
        this.currentUrl         = this.Navigation();
		this.createNewToken     = driver.findElement(By.id("createToken"));
		this.createnewclient    = driver.findElement(By.id("createClient"));
		this.createclientbtn    = driver.findElement(By.id("createTokenBtn"));
        this.createtokenname    = driver.findElement(By.id("create-token-name"));
        this.createclientname   = driver.findElement(By.id("create-client-name"));
        this.accesstokenbtn     = driver.findElement(By.id("createClientTokenBtn"));
		this.redirect           = driver.findElement(By.xpath("//div[@id='modal-create-client']/div/div/div[2]/form/div[2]/div/input"));
    }



    public String Navigation() {
        driver.get("http://127.0.0.1:8000/home");
        return driver.getCurrentUrl();
    }

	public void actionCreateToken(){
		accesstokenbtn.click();
	}

	public void actionCreateClient(){
		createclientbtn.click();
	}

	public void actionCreateTokenModel(){
		createNewToken.click();
	}

	public void actionCreateClientModel(){
		createnewclient.click();
	}

	public void setInputtokenname(String name){
		this.createtokenname.sendKeys(name);
	}

	public void setInputclientname(String name){
		this.createclientname.sendKeys(name);
	}

	public void setInputredirect(String redirect){
		this.redirect.sendKeys(redirect);
	}

	public Boolean getError(){
		return driver.findElement(By.cssSelector(".alert")).isDisplayed();
	}

}
