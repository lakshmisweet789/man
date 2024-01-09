package com.orange.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mainloginpage {
@FindBy(name = "username") private WebElement usernametf;
@FindBy(name = "password")   private WebElement passwordtf;     
@FindBy(xpath = "//button[@type='submit']") private WebElement submitbtn; 
@FindBy(xpath = "//div[@class='orangehrm-login-forgot']")  private WebElement forgotbtn; 

public mainloginpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void username()
{
usernametf.sendKeys("Admin");	
}
public void password()
{
	passwordtf.sendKeys("admin123");
	
}
public void submitbutton()
{
	submitbtn.click();
}
public void forgotpsd()
{
	forgotbtn.click();
}
}