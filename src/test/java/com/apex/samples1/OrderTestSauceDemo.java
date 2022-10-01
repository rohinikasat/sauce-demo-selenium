package com.apex.samples1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.apex.samples.core.Selenium_Util;

public class OrderTestSauceDemo implements SauceDemoConstants {

	@Test(priority=1)	
	public static void testBagpackOrder() throws InterruptedException {
			WebDriver driver = Selenium_Util.webDriverSetup("Chrome");

			String expectedText = "back-to-products";
			
			driver.get(baseURL);
			driver.manage().window().maximize();
			driver.findElement(By.name("user-name")).sendKeys("standard_user");
			Thread.sleep(2000);
			driver.findElement(By.name("password")).sendKeys("secret_sauce");
			Thread.sleep(2000);
			driver.findElement(By.name("login-button")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("checkout")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("firstName")).sendKeys("Rohini");
			Thread.sleep(2000);
			driver.findElement(By.name("lastName")).sendKeys("Kasat");
			Thread.sleep(2000);
			driver.findElement(By.name("postalCode")).sendKeys("95051");
			Thread.sleep(2000);
			driver.findElement(By.id("continue")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("finish")).click();
			Thread.sleep(5000);
			String actualText = driver.findElement(By.xpath("//*[@id=\"back-to-products\"]"))
					.getAttribute("name");
			driver.close();
			
			Assert.assertEquals(expectedText, actualText, "Text verification failed");
			
			
		}
}
