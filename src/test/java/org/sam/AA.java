package org.sam;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AA extends BaseClass {
	@DataProvider(name="Amazon Data")
	public Object datas() {
		return new Object[][] {
			{"Jeggings"},
			{"Leggings"},
			{"Patiala"},
			{"Palazo"}
			
		};
		
	}
	@Test(dataProvider="Amazon Data")
	public void tc50(String product) throws AWTException {
		browser();
		
		launchUrl("https://www.amazon.in/");
		windowMaximize();
		WebElement srcbox = driver.findElement(By.id("twotabsearchtextbox"));
		srcbox.sendKeys(product);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		}
	@Test
	private void tc51() {
		System.out.println("Test Case 51");

	}
	
	@Test
	private void tc52() {
		//browser();
		System.out.println("Test Case 52");
	}

}
