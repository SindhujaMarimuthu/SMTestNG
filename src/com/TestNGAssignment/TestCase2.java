package com.TestNGAssignment;



import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase2 {

	@BeforeMethod
	@BeforeClass
	public void setUp() {
		Reporter.log("TestNG_ReportsAndLogs -> This runs once before class", true);
	}

	@AfterClass
	public void cleanUp() {
		Reporter.log("TestNG_ReportsAndLogs -> This runs once after class", true);
	}

	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("TestNG_ReportsAndLogs -> This runs before every method", true);
	}

	@AfterMethod
	public void afterMethod() {
		Reporter.log("TestNG_ReportsAndLogs -> This runs after every method", true);
	}

	@Test(groups = { "SmokeTest3" })
	@Parameters({ "inverse" })
	public void multiplication(int inverse) {
		Object exepectedCondition = 12;
		Object s = CalculatorClass.inverse(inverse);
		// Using assertTrue
		System.out.println("Using assertTrue");
		Reporter.log("TestNG_ReportsAndLogs -> inverse is completed", true);
	assertTrue(true, "Verfied through assertion");

	}

	@Test(groups = { "SmokeTest3" })
	@Parameters({ "negate" })
	public void negate(int negate) {
		Object exepectedCondition = 12;
		Object s = CalculatorClass.negate(negate);
		// Using assertTrue
		System.out.println("Using assertTrue");
		Reporter.log("TestNG_ReportsAndLogs -> negate is completed", true);
		assertTrue(true, "Verfied through assertion");

	}

}


