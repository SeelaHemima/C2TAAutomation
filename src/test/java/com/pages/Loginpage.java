package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.library;
import com.reusable.seleniumutility;



public class Loginpage extends library{
	public seleniumutility S;
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement username;
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password;
	@FindBy(xpath="//button[text()=' Login ']")
	WebElement Loginbutton;

public void Enterusername(String value) {
	 S=new seleniumutility(driver);
	 S.EnterValue(username, value);
}
public void EnterPassword(String value) {
	S=new seleniumutility(driver);
	S.EnterValue(password, value);
}
public void loginbutton() {
	S=new seleniumutility(driver);
	S.doClick(Loginbutton);
}
}