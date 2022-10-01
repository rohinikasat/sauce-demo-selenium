package com.apex.samples1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.apex.samples.core.Selenium_Util;

public class LoginTestSauceDemo implements SauceDemoConstants {

	@Test(priority=1)
	public static void testLoginWithSuccessfulData() throws InterruptedException {
		WebDriver driver = Selenium_Util.webDriverSetup("Chrome");

		String expectedText = "add-to-cart-sauce-labs-backpack";
		
		driver.get(baseURL);
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(5000);
		String actualText = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"))
				.getAttribute("name");
		driver.close();		
		
		Assert.assertEquals(expectedText, actualText, "Text verification failed");
		
		
	}
	
	@Test(priority=2)
	public static void testLoginWithBlankData() throws InterruptedException {
		WebDriver driver = Selenium_Util.webDriverSetup("Chrome");

		String expectedText = "error";
		
		driver.get(baseURL);
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(5000);
		String actualText = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3"))
				.getAttribute("data-test");
		driver.close();
		Assert.assertEquals(expectedText, actualText, "Text verification failed");
	}
	
	@Test(priority=3)
	public static void testLoginWithLockedOutUser() throws InterruptedException {
		WebDriver driver = Selenium_Util.webDriverSetup("Chrome");
		
		String expectedText = "error";

		driver.get(baseURL);
		driver.findElement(By.name("user-name")).sendKeys("locked_out_user");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(5000);
		String actualText = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3"))
				.getAttribute("data-test");
		driver.close();
		Assert.assertEquals(expectedText, actualText, "Text verification failed");
	}
	
	@Test(priority=4)
	public static void testLoginWithProblemUser() throws InterruptedException {
		WebDriver driver = Selenium_Util.webDriverSetup("Chrome");

		String expectedText = "https://www.saucedemo.com/static/media/sl-404.168b1cce.jpg";
		
		driver.get(baseURL);
		driver.findElement(By.name("user-name")).sendKeys("problem_user");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(5000);
		String actualText = driver.findElement(By.xpath("//*[@id=\"item_4_img_link\"]/img"))
				.getAttribute("src");
		driver.close();
		Assert.assertEquals(expectedText, actualText, "Text verification failed");
	}
	
	@Test(priority=5)
	public static void testLoginWithPerformanceGlitchUser() throws InterruptedException {
		WebDriver driver = Selenium_Util.webDriverSetup("Chrome");
		
		driver.get(baseURL);
		driver.findElement(By.name("user-name")).sendKeys("performance_glitch_user");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(5000);
		driver.close();
	}
	

}
