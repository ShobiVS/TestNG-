package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertTestng extends BaseClass {
	@Test
	private void Tc1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String title = pageTitle();
		WebElement element = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		element.sendKeys("Earrings");
		Assert.assertTrue(title.contains("cart"), "Check your title");
		WebElement srchbtn = driver.findElement(By.xpath("//button[@type='submit']"));
        srchbtn.click();
	}
	
	private void Tc2() {
		driver.get("https://www.flipkart.com/");
		String title1 = pageTitle();
		WebElement ele = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
	    ele.sendKeys("iPhone");
	    SoftAssert s=new SoftAssert();
	    s.assertTrue(title1.contains("Carrage"), "Check your page");
	    WebElement btn = driver.findElement(By.xpath("//button[@type='submit']"));
	    btn.click();
	    s.assertAll();
	
	
	
	}
	
	
	
	
	
	
	
	
	
	

}
