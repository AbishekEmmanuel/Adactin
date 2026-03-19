package com.app.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ThirdPage extends SecondPage {
	public static WebElement confirmbtn() {
		return driver.findElement(By.id("radiobutton_0"));
	}
	public static WebElement continbtn() {
		return driver.findElement(By.id("continue"));
	}
	

}
