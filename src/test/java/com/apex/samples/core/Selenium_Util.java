package com.apex.samples.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Util {
	public static WebDriver webDriverSetup(String browser) {
		
		
		if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			return new FirefoxDriver();
		} else if (browser.equals("Chrome")) {
			 WebDriverManager.chromedriver().setup();
			 return new ChromeDriver();
		} else if (browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			return new EdgeDriver();
		}
		return null;
	}
}
