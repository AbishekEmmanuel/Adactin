package com.app.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.app.Base.Utility;

public class LoginPage extends Utility{
	
	public static WebElement userName() {
		return driver.findElement(By.id("username"));
	}
	
	public static WebElement pswd() {
		return driver.findElement(By.id("password"));
	}
	public static WebElement loginBtn() {
		 return driver.findElement(By.id("login"));
	}	
	
}

