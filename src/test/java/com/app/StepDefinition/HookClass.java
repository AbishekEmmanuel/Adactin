package com.app.StepDefinition;

import com.app.Base.Utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookClass extends Utility{

	@Before
	public static void browserLaunch() {
		Utility.browserLaunch();
		
	}
	@After
	public static void tearDown() {
		Utility.closeBrowser();
		
		
	}
	
}
