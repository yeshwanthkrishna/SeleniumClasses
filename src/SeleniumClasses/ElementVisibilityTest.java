package SeleniumClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(05, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://api.cogmento.com/register/");
		
		//isDislayed() is applicable for all elements
		boolean b1=driver.findElement(By.name("action")).isDisplayed();
		System.out.println(b1);//true
		
		boolean b2=driver.findElement(By.name("action")).isEnabled();
		System.out.println(b2);//true
		
		driver.findElement(By.id("terms")).click();
		boolean b3=driver.findElement(By.id("terms")).isSelected();
		System.out.println(b3);//true
		Thread.sleep(2000);
		
		driver.findElement(By.id("terms")).click();
		boolean b4=driver.findElement(By.id("terms")).isSelected();
		System.out.println(b4);//false
		Thread.sleep(2000);
		
		
		driver.get("https://www.facebook.com/");
		//is selected() is applicable for radio button, check box, dropdown
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_7")).click();
		boolean b5=driver.findElement(By.id("u_0_7")).isSelected();
		System.out.println(b5);//true
		
		
		
	}

}
