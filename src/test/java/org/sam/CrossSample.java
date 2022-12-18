package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossSample {
	@Parameters("browser")
	@Test
	
	private void tc1(String browserName) {
		WebDriver driver;
		if (browserName.equals("chromebrowser")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browserName.equals("Firefoxbrowser")){
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		WebElement signIn = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		signIn.click();
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("bsbargavi@gmail.com");
		WebElement cont = driver.findElement(By.id("continue"));
		cont.click();
		WebElement pwd = driver.findElement(By.id("password"));
        pwd.sendKeys("651556");
        WebElement sub = driver.findElement(By.id("signInSubmit"));
	    sub.click();
	}
	
	

}
