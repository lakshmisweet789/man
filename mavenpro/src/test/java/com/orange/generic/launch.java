package com.orange.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launch {
 public WebDriver driver;
 @BeforeClass
 public void open()
 {
	 WebDriverManager.firefoxdriver().setup();
	 driver=new FirefoxDriver();
	 driver.get(url);
	 Thread.sleep(2000);
	 ok
 }
 @BeforeMethod
 public void login()
 {
	 
 }
}

