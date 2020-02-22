package com.org.automation.component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TokenComponent {
    
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
        this.redirect           = driver.findElement(By.name("redirect"));
        this.createtokenname    = driver.findElement(By.id("create-token-name"));
        this.createclientname   = driver.findElement(By.id("create-client-name"));
        this.createclientbtn    = driver.findElement(By.className("btn-primary"));
        this.createNewToken     = driver.findElement(By.linkText("Create New Token"));
        this.createnewclient    = driver.findElement(By.linkText("Create New Client"));
        this.accesstokenbtn     = driver.findElement(By.cssSelector("#modal-access-token .btn"));
        this.createclientbtn    = driver.findElement(By.cssSelector("#modal-create-client .btn-primary"));
    }

    public String Navigation() {
        driver.get("http://127.0.0.1:8000/home");
        return driver.getCurrentUrl();
    }

    public void actionCreateClient(){
        createnewclient.click();
    }
    
    public void actionCreateToken(){
        createNewToken.click();
    }

}
