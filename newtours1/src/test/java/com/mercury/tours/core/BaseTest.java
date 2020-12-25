package com.mercury.tours.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	String driverPath = "D:\\geckodriver.exe";
    public WebDriver driver;
	
	@BeforeTest
    public WebDriver setup(){

        System.setProperty("webdriver.gecko.driver", driverPath);
        
        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://demo.guru99.com/V4/");
        return driver;

    }


}
