package org.sam;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SamTest extends BaseClass {
	@Test(priority=-52)
	private void tc1() {
		launchUrl("https://www.gmail.com");
		windowMaximize();
		fLoginPojo f=new fLoginPojo();
		passtext("shobi@gmail.com", f.getEmail());
		//passtext("1245", f.getPwd());
		System.out.println("Test Case 1");
		
	}
	@Test (priority=-20)
	private void tc2() {
		launchUrl("https://inmakes.com");
		windowMaximize();
		
		
		System.out.println("Test Case 2");
	}
   
	@Test (priority=14)
	private void tc4() {
		launchUrl("https://www.flipkart.com");
		windowMaximize();
		System.out.println("Test Case 4");
	}
	

	@Test  (priority=20)
	private void tc5() {
		launchUrl("https://www.amazon.in");
		windowMaximize();
		System.out.println("Test Case 5");
	}
	

	@Test (priority=30)
	private void tc6() {
		launchUrl("https://en-gb.facebook.com/");
		windowMaximize();
		System.out.println("Test Case 6");
	}
	@Test (priority=-10)
	private void tc3() {
		launchUrl("https://www.redbus.com");
		windowMaximize();
		System.out.println("Test Case 3");
	}
	
	@Test (priority=50)
	private void tc7() {
		launchUrl("https://www.youtube.com");
		windowMaximize();
		System.out.println("Test Case 7");
	}
	
	@BeforeMethod
	private void StartDate() {
		//Date d= new Date();
		System.out.println("Test Case Starting Date and Time" );

	}
	@AfterMethod
	private void endDate() {
		//Date d=new Date();
		System.out.println("Test Case Ending Date and Time" );

	}
	@BeforeClass
	private void Thebrowser() {
		browser();
		windowMaximize();
		System.out.println("Launch Browser");

	}
	@AfterClass
	private void closeTheBrowser() {
		System.out.println("Browser Close");
	}
}
