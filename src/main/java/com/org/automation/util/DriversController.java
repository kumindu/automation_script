package com.org.automation.util;

import org.openqa.selenium.WebDriver;

public interface DriversController {
	//Web driver
    WebDriver getDriver(String name, double ver, boolean type);
}
