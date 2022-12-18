package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovide extends BaseClass {
	@DataProvider(name="Sample Data")
	private Object[][] data() {
		return new Object[][] {
			{"v.s.shobi@gmail.com","122455"},
			{"bsbargavi@gmail.com","553485"},
			{"shobivs@gmail.com","54545451"}
			
	};
	}
	@Test (dataProvider="Sample Data")
	private void tc1(String s, String p) {
		browser();
		windowMaximize();
		driver.get("https://en-gb.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(s);
		WebElement pwd = driver.findElement(By.name("pass"));
		pwd.sendKeys(p);
	}
}
