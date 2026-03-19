package com.app.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SecondPage extends LoginPage {
	
	public static WebElement location() {
		return driver.findElement(By.id("location"));
	}
	public static WebElement hotels() {
		return driver.findElement(By.id("hotels"));
	}
	public static WebElement roomtype() {
		return driver.findElement(By.id("room_type"));
	}
	public static WebElement no_of_room() {
		return driver.findElement(By.id("room_nos"));
	}
	public static WebElement checkindate() {
		return driver.findElement(By.id("datepick_in"));
	}
	public static WebElement checkoutdate() {
		return driver.findElement(By.id("datepick_out"));
	}
	public static WebElement no_of_adults() {
		return driver.findElement(By.id("adult_room"));
	}
	public static WebElement no_of_child() {
		return driver.findElement(By.id("child_room"));
	}
	public static WebElement submit() {
		return driver.findElement(By.id("Submit"));
	}
}
