package com.sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_Login 
{
	@Test
	public void LoginTest() throws InterruptedException
	{
    	//WebDriverManager.chromedriver().setup();
    	
    	ChromeDriver driver = new ChromeDriver();    	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
		Thread.sleep(5000);
	}

}
