package com.automation.newpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchApp {

	@Test
	public void launch()
	{
		//System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com");
		System.out.println("Launched portal");
		driver.manage().window().maximize();
	}	
	
}
