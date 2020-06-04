package SeleniumClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;

public class ScreenshotConcept {

	public static void main(String[] args) {  
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sai\\Downloads\\geckodriver-v0.26.0-win32\\geckodriver.exe");	

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.get("https://twitter.com/?lang=en-ca");

	}
	
}
