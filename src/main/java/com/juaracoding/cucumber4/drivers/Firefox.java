package com.juaracoding.cucumber4.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.juaracoding.cucumber4.drivers.DriverStrategy;

public class Firefox implements DriverStrategy {
	
public WebDriver setStrategy() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;

}

}