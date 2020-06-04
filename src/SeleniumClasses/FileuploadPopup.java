package SeleniumClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileuploadPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
//driver.get("https://www.facebook.com/");
//driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("5147093914");
driver.get("https://html.com/input%20type%20file/");
driver.findElement(By.xpath("//*[@id=\"fileupload\"]")).sendKeys("C:\\Users\\sai\\Desktop\\Ielts\\Cambridge IELTS 10\\IELTS 10");

	}

}	
