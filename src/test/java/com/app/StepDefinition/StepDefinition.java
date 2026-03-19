package com.app.StepDefinition;

import com.app.pageExe.LastPageExe;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends LastPageExe {
	@Given("Enter the URL {string}")
	public void enter_the_url(String url) {
		HookClass.browserLaunch();
		loadURL(url);
	}
	@When("Enter the Username {string}")
	public void enter_the_username(String userName) {
		getUserName(userName);
	}
	@When("Enter the Password {string}")
	public void enter_the_password(String pswd) {
		getPassword(pswd);
	}
	@When("Click the login button")
	public void click_the_login_button() {
		loginbutton();
	   
	}
	@When("Select the value in Location dropdown {string}")
	public void select_the_value_in_location_dropdown(String loc) {
		getLocation(loc);
	}
	@When("Select the value in Hotels dropdown {string}")
	public void select_the_value_in_hotels_dropdown(String hotels) {
		getHotel(hotels);
	}
	@When("Select the value in RoomType dropdown {string}")
	public void select_the_value_in_room_type_dropdown(String roomtype) {
		getRoomtype(roomtype);
	}
	@When("Select the value in No.of Rooms dropdown {string}")
	public void select_the_value_in_no_of_rooms_dropdown(String noRoom) {
		getNo_Of_Room(noRoom);
	}
	@When("Enter the Checkin data {string}")
	public void enter_the_checkin_data(String inDate) {
       getCheckindata(inDate);
	}
	@When("Enter the Checkout date {string}")
	public void enter_the_checkout_date(String outDate) {
         getCheckoutdate(outDate);
	}
	@When("Select the value in Adults per Room dropdown {string}")
	public void select_the_value_in_adults_per_room_dropdown(String adults) {
          getAdults(adults);
	}
	@When("Select the value in Childern per Room dropdown {string}")
	public void select_the_value_in_childern_per_room_dropdown(String child) {
          getChild(child);
	}
	@When("Click the search button")
	public void click_the_search_button() {
		submitBtn();
	}
	@When("Click the select button")
	public void click_the_select_button() {
		clickConfirmBtn();

	}
	@When("Click the Continue button")
	public void click_the_continue_button() {
		clickContinBtn();
	    
	}
	@When("Enter the First Name {string}")
	public void enter_the_first_name(String fname) {
      getFname(fname);
	}
	@When("Enter the Last Name {string}")
	public void enter_the_last_name(String lname) {
      getLname(lname);
	}
	@When("Enter the Billing Address {string}")
	public void enter_the_billing_address(String address) {
	    getAddress(address);
	}
	@When("Enter the CC Number {string}")
	public void enter_the_cc_number(String ccno) {
       getCcno(ccno);
	}
	@When("Select the value in CC Type dropdown {string}")
	public void select_the_value_in_cc_type_dropdown(String cctype) {
	   getCctype(cctype);   
	}
	@When("Select the Value in Expiry date Month {string}")
	public void select_the_value_in_expiry_date_month(String expmonth) {
	    getExpMonth(expmonth);
	}
	@When("Select the Value in Expiry date Year {string}")
	public void select_the_value_in_expiry_date_year(String expyr) {
	    getExpyr(expyr);
	}
	@When("Enter the CVV Number {string}")
	public void enter_the_cvv_number(String cvvno) {
	    getCvvno(cvvno);
	}
	@Then("Click the Book Now button")
	public void click_the_book_now_button() {
	    bookButton();
	}
	@Then("Close the Browser")
	public void close_the_browser() {
		HookClass.tearDown();
	}
	}