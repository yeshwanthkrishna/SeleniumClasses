package SeleniumClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ReadPropertyfile {

	public static void main(String[] args) throws IOException {
		
	Properties prop=new Properties();
	FileInputStream fileipstream=new FileInputStream("C:\\Users\\sai\\eclipse-workspace\\SeleniumSessions\\src\\SeleniumClasses\\Config.properties");

	prop.load(fileipstream);
	System.out.println(prop.getProperty("name"));
	System.out.println(prop.getProperty("age"));
	String url=prop.getProperty("URL");
	System.out.println(url);
	if
		(url.equals("https://www.facebook.com"))
	{
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sai\\Downloads\\chromedriver.exe");
	 WebDriver driver =new ChromeDriver();
	//driver.get("https://www.facebook.com");
	//driver.get(url);
	driver.findElement(By.xpath(prop.getProperty("firstnameXpath"))).sendKeys(prop.getProperty("firstname"));
	driver.findElement(By.xpath(prop.getProperty("lastnameXpath"))).sendKeys(prop.getProperty("lastname"));
	
	driver.findElement(By.name("birthday_month")).click();
	
	}
	else if(url.equals("https://www.amazon.com"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sai\\Downloads\\geckodriver-v0.26.0-win32\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get(url);
	
	
	driver.findElement(By.xpath(prop.getProperty("first name_Xpath"))).sendKeys("first name");
	driver.findElement(By.xpath(prop.getProperty("last name_Xpath"))).sendKeys("last name");
	}
	
	
	}

}
