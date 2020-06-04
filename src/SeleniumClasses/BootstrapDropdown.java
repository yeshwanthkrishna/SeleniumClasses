package SeleniumClasses;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BootstrapDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sai\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		/*ChromeOptions options=new ChromeOptions();
		options.addArguments("window-size=1400.800");
		options.addArguments("headless");*/
//the above statements are used for headless browser 		
		WebDriver driver=new ChromeDriver(options);//options were used for headless browser execution 
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(05, TimeUnit.SECONDS);
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		driver.findElement(By.xpath("//button[contains(text(), 'Dropdown button')]")).click();
		
//List<WebElement> list = driver.findElements(By.xpath("//ul[contains(@class, 'multiselect')]//li//a//label"));
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='dropdown-menu' and @aria-labelledby='dropdownMenuButton']//a"));
		
		System.out.println(list.size());

for(int i=0; i<list.size();i++) {
	System.out.println(list.get(i).getText());
	
		
		
}
	}

}
