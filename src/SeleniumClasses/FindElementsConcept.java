package SeleniumClasses;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://www.ebay.com/");
//driver.findElement(By.xpath("//a[contains(text(), 'Signin')]")).click();
 
//get the count of links on the page
//get the text of each link on the page

List <WebElement> links=driver.findElements(By.tagName("a"));

//count of links on that page
System.out.println(links.size());

//get the 
for(int i=0;i<links.size();i++) {
	String linktext=links.get(i).getText();
	System.out.println(linktext);

	
}
	}

}
