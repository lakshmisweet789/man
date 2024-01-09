package com.orange.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class adminpage {
@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
private WebElement addbtn;
@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
private WebElement username;
@FindBy(xpath = "//input[@placeholder='Type for hints...']")
private WebElement empname;
@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
private WebElement status;
@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")
private WebElement resetbtn;
@FindBy(xpath = "//button[@type='submit']")
private WebElement searchbtn;








}
