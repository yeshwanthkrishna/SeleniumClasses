package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;
	
	@BeforeMethod
	public void settingupchrome() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sai\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
	
	}
	
	/*@Test(priority=1, groups="title")
	
	public void google() {
		String title=driver.getTitle();
		System.out.println(title);
	Assert.assertEquals(title, "Google", "title not matched");//this statement is to validate the title is Google or not, if it is not then it will display as title not matched
	}*/
//if we give priority then it will execute as prioritized
//groups are for reports
//dependsOnMethods are for it is depends on that particular class...if that particular class executes then only it will execute this0
	
	@Test(priority=2)
	public void testing() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sai\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a")).click();
		
	}
	
	@Test(priority=3)
		public void openingselenium() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sai\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	boolean b1	=driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a")).isDisplayed();
		System.out.println(b1);
		}
		
	@AfterMethod
		public void teardown() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sai\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
			driver.close();
			
		}
	
	@AfterTest
	public void close() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sai\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	driver.quit();
}
	}
	
	
	
	


