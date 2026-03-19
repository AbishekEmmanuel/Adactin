package com.app.pageExe;

import com.app.Base.Utility;

public class LastPageExe extends ThirdPageExe{
	
	public static void getFname(String fname) {
		Utility.sendKeys(fname(), fname);
	}
	public static void getLname(String lname) {
		Utility.sendKeys(lname(), lname);
	}
	public static void getAddress(String address) {
		Utility.sendKeys(address(), address);
	}
	public static void getCcno(String ccno) {
		Utility.sendKeys(ccno(), ccno);
	}
	public static void getCctype(String cctype) {
		Utility.selectClass(cctype(), cctype);
	}
	public static void getExpMonth(String expmonth) {
		Utility.selectClass(expmonth(), expmonth);
	}
	public static void getExpyr(String expyr) {
		Utility.selectClass(expyr(), expyr);
	}
	public static void getCvvno(String cvvno) {
		Utility.sendKeys(cvvno(), cvvno);
	}
	public static void bookButton() {
		Utility.click(bookbtn());
	}

	
}
