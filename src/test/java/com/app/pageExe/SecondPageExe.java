package com.app.pageExe;

import com.app.Base.Utility;

public class SecondPageExe extends LoginPageExe{
	public static void getLocation(String loc) {
		Utility.selectClass(location(), loc);
	}
	public static void getHotel(String hotels) {
		Utility.selectClass(hotels(), hotels);
	}
	public static void getRoomtype(String roomtype) {
		Utility.selectClass(roomtype(), roomtype);
	}
	public static void getNo_Of_Room(String noRoom) {
		Utility.selectClass(no_of_room(), noRoom);
	}
	public static void getCheckindata(String inDate) {
		Utility.sendKeys(checkindate(), inDate);
	}
	public static void getCheckoutdate(String outDate) {
		Utility.sendKeys(checkoutdate(), outDate);
	}
	public static void getAdults(String adults) {
		Utility.selectClass(no_of_adults(), adults);
	}
	public static void getChild(String child) {
		Utility.selectClass(no_of_child(), child);
	}
	public static void submitBtn() {
		Utility.click(submit());
	}
}
	


