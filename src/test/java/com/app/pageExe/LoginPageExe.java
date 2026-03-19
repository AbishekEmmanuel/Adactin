package com.app.pageExe;

import com.app.Base.Utility;
import com.app.Locator.LastPage;

public class LoginPageExe extends LastPage{
	
	public static void getUserName(String userName) {
		Utility.sendKeys(userName(), userName);
	}
	public static void getPassword(String pswd) {
		Utility.sendKeys(pswd(), pswd);
	}
	public static void loginbutton() {
		Utility.click(loginBtn());
	}

}
