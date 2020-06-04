package SeleniumClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.support.ui.Select;

public class LocatorConcepts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	//xpath
	//driver.findElement(By.xpath("//*[@id=\"u_0_m\"]")).sendKeys("Yeshwanth krishna");
	//driver.findElement(By.xpath("//*[@id=\"u_0_o\"]")).sendKeys("Kudikala");
		
	//id
	//driver.findElement(By.id("//*[@id=\"u_0_m\"]")).sendKeys("Yeshwanth krishna");\
	
	//name
	//driver.findElement(By.name("first name")).sendKeys("Yeshwanth Krishna");
	//driver.findElement(By.name("lastname")).sendKeys("Kudikala");
	
	//LinkText
	//driver.findElement(By.linkText("Create a Page")).click();
	
	//partial link text
	//driver.findElement(By.partialLinkText("Forgot account")).click();
	
	//*****selecting the drop down values****
	//css selector
	Select yeardropdown=new Select(driver.findElement(By.cssSelector("#year")));
	yeardropdown.selectByVisibleText("2020");  
	
	//class name
	//driver.findElement(By.className("_8esh")).click();
	//driver.findElement(By.className("inputtext login_form_input_box")).sendKeys("KrishnA@$17");
	}

}

