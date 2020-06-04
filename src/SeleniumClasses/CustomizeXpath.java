package SeleniumClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizeXpath {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("https://www.ebay.com/");
//driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Yeshwanth Krishna");
//driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("Krishna");	
//driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Kudikala");
	//driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input')]")).sendKeys("Kittu");
	
//if any id value has too many values like id=test_123456, we can use contains function
	//for example id=test_123456_test_t
	//also we can use starts-with and ends-with function
//driver.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("");
//driver.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("");
//driver.findElement(By.xpath("//input[ends-with(@id,'_test_t')]")).sendKeys("");
	
	//Customize x-path for links
	//driver.findElement(By.xpath("//a[contains(text(), 'Sign in')]")).click();
	//driver.findElement(By.xpath("//a[contains(text(), 'My eBay')]")).click();
	
	
	
	
	
	}
}
