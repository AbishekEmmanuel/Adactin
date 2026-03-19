package com.app.Base;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Utility {
	public static WebDriver driver;
	
	//Browser Launch
	public static void browserLaunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	//Load URL
	public static void loadURL(String url) {
		driver.get(url);
	}
	
	//Close
	public static void closeBrowser() {
		driver.quit();
	}
	
	//Send Keys
	public static void sendKeys(WebElement element, String value) {
	element.clear();
	element.sendKeys(value);
	}
	
	//Click
	public static void click(WebElement element) {
		element.click();
	}
	
	//Select Class
	public static void selectClass(WebElement element, String value) {
		Select s= new Select(element);
		s.selectByValue(value);
	}
	
	//Locator
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	//Get Attribute Value
	public static String getAttribute(WebElement element, String attrName) {
		return element.getAttribute(attrName);
	}
	
	
	
	
	
	
	
	
	

}
