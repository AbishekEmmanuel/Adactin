package com.app.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LastPage extends ThirdPage {
	public static WebElement fname() {
		return driver.findElement(By.id("first_name"));
	}
	public static WebElement lname() {
		return driver.findElement(By.id("last_name"));
	}
	public static WebElement address() {
		return driver.findElement(By.id("address"));
	}
	public static WebElement ccno() {
		return driver.findElement(By.id("cc_num"));
	}
	public static WebElement cctype() {
		return driver.findElement(By.id("cc_type"));
	}
	public static WebElement expmonth() {
		return driver.findElement(By.id("cc_exp_month"));
	}
	public static WebElement expyr() {
		return driver.findElement(By.id("cc_exp_year"));
	}
	public static WebElement cvvno() {
		return driver.findElement(By.id("cc_cvv"));
	}
	public static WebElement bookbtn() {
		return driver.findElement(By.id("book_now"));		
	}
	

}
