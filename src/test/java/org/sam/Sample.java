package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	@Test
	private void Tc3() {
		System.out.println("TC3 :" +Thread.currentThread().getId());
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        
	
	}
	
	@Test
	private void Tc2() {
		System.out.println("TC2 :" +Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("v.s.shobi@gmail.com");
		WebElement pwd = driver.findElement(By.name("pass"));
	    pwd.sendKeys("87452458");
	    
	
	}
	
	@Test
	private void Tc1() {
		System.out.println("TC1:" +Thread.currentThread());
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		
	}
	
	
	
	

}
