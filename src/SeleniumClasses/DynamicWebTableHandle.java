package SeleniumClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicWebTableHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(05, TimeUnit.SECONDS);
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");							
		        	
		//*[@id="example"]/tbody/tr[1]/td[2]
		//*[@id="example"]/tbody/tr[2]/td[2]
		//*[@id="example"]/tbody/tr[3]/td[2]
		//*[@id="example"]/tbody/tr[4]/td[2]
		
	//Method1
	
	String before_xpath = "//*[@id=\"example\"]/tbody/tr[";
	String after_xpath = "]/td[2]";
	
	for(int i=1;i<=4;i++) {
String name = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
		System.out.println(name);
		if(name.contains("Bradley Greer")) {
			
		
	
			driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[4]/td[1]")).click();
		
		}
		
	}
	
	//Method2
	//driver.findElement(By.xpath("//a[contains(text(),'Bradley Greer')]/parent::td//preceding-sibling::td//[@class='select-checkbox']")).click();
	
	
	}


}
