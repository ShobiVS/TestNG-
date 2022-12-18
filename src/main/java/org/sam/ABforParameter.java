package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ABforParameter extends BaseClass{
	@Parameters({"use","pas"})
	@Test
	private void tc1(@Optional("bsbargavi@gmail.com")String a, @Optional("5643") String b) {
		browser();
		windowMaximize();
		driver.get("https://en-gb.facebook.com/");
		WebElement emailid = driver.findElement(By.id("email"));
		emailid.sendKeys(a);
		WebElement pwd = driver.findElement(By.name("pass"));
		pwd.sendKeys(b);
		
		

	}

}
