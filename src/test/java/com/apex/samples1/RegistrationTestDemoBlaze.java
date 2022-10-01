package com.apex.samples1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.apex.samples.core.Selenium_Util; 

public class RegistrationTestDemoBlaze {
	
	@Test(priority=1)
	public static void testRegistrationWithSuccessfulData() throws InterruptedException {
		WebDriver driver = Selenium_Util.webDriverSetup("Chrome");
		
		driver.get("https://www.demoblaze.com/");
		driver.findElement(By.id("signin2")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("sign-username")).sendKeys("RohiniKasat1");
		Thread.sleep(2000);
		driver.findElement(By.id("sign-password")).sendKeys("apex123");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
		//Thread.sleep(5000);
		
		driver.close();
	}

}
