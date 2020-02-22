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
package com.org.automation.util;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;

public class WebDrivers implements DriversController {

    //Get current system working operating systems
    private static String OS = System.getProperty("os.name").toLowerCase();
    //Define project resources folder location for mac os
    private static String mac_base="src\\main\\resources\\";
    //Define project resources folder location for Other os
    private static String win_base="src/main/resources/";

    //Define browsers
    private static String [] browser=
            {
                "IE", "chrome","edge","opera","firefox"   
            };

    //Define windows os selenium drivers
    private static String [] drivers_win=
            {
                "IEDriverServer.exe","chromedriver.exe",
                "msedgedriver.exe","operadriver.exe",
                "geckodriver.exe" 
            };

    //Define linux os selenium drivers
    private static String [] drivers_lnx=
            {
                "IEDriverServer.exe","chromedriver.exe",
                "msedgedriver.exe","operadriver.exe",
                "geckodriver.exe"
            };

    //Define mac os selenium drivers
    private static String [] drivers_mac=
            {
                "IEDriverServer.exe","chromedriver.exe",
                "msedgedriver.exe","operadriver.exe",
                "geckodriver.exe"
            };

    //Define selenium drivers class
    private static String [] drivers_class=
            {
                "webdriver.ie.driver", "webdriver.chrome.driver",
                "webdriver.edge.driver","webdriver.opera.driver",
                "webdriver.gecko.driver"
            };

    //Get selected web driver
    public WebDriver getDriver(String name,double ver,boolean type){
      switch (name) {
        case "IE":
           //return Internet Explorer Driver
           return getIEDriver(0,ver,type);
        case "ED":
           //return Edge Driver
           return getEDDriver(2,ver,type);
        case "OP":
            //return Opera Driver
           return getOPDriver(3,ver,type);
        case "FX":
            //return FireFox Driver
           return getFXDriver(4,ver,type);
        case "CH":
            //return Chrome Driver
           return getCHDriver(1,ver,type);
      }
       return null;
    }

    //Identifier web drive request bit 32 or bit 64 base
    private String getPath(int i,double ver,String broweser,boolean type){
        if(type)
           //if request 64 bit return this 
           return getDriverpath(broweser,ver,"x64",i);
        else
           //if request 32 bit return this 
           return getDriverpath(broweser,ver,"x32",i);
    }

    //Get Internet Explorer web driver
    private WebDriver getIEDriver(int i,double ver,boolean type){
        System.setProperty(drivers_class[i],getPath(i,ver,browser[i],type));
        return new InternetExplorerDriver();
    }

    //Get Edge web driver
    private WebDriver getEDDriver(int i,double ver,boolean type){
        System.setProperty(drivers_class[i],getPath(i,ver,browser[i],type));
        return new EdgeDriver();
    }

    //Get Opera web driver
    private WebDriver getOPDriver(int i,double ver,boolean type){
        System.setProperty(drivers_class[i],getPath(i,ver,browser[i],type));
        return new OperaDriver();
    }

    //Get FireFox web driver
    private WebDriver getFXDriver(int i,double ver,boolean type){
        System.setProperty(drivers_class[i],getPath(i,ver,browser[i],type));
        return new FirefoxDriver();
    } 

    //Get Chrome web driver
    private WebDriver getCHDriver(int i,double ver,boolean type){
        System.setProperty(drivers_class[i],getPath(i,ver,browser[i],type));
        return new ChromeDriver();
    }

    //Get web driver path
    private String getDriverpath(String bw,double ver,String bit,int i){
      if (OS.contains("windows"))
         //If current is windows os return this driver path
         return win_base +bw+"/"+bw+"-"+ver+"/win_"+bit+"/"+drivers_win[i];
      else if (OS.contains("mac"))
         //If current is mac os return this driver path
         return mac_base +bw+"/"+bw+"-"+ver+"/lnx_"+bit+"/"+drivers_mac[i];
      else
         //If current is linux base os return this driver path
         return  win_base +bw+"/"+bw+"-"+ver+"/mac_"+bit+"/"+drivers_lnx[i];
    }

}
