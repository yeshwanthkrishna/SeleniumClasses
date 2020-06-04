package SeleniumClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class HtmlUnitDriverConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();

		//To Use  HtmlUnitDriver we have to download htmlunitdriver.jar file 
//after downloading we have to insert htmlunitdriver.jar file into our project
//this is also called Ghost Driver (or) Headless Browser
		
//WebDriver driver=new HtmlUnitDriver(); //Testing is happening behind the scene means no chrome browser launched
		/*driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://freecrm.com/index.html");
		System.out.println("after login, title is:..."+ driver.getTitle());
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/div[2]/a")).click();
		
		System.out.println("Before login title is:..."+ driver.getTitle());
		
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/input[3]")).click();
		Thread.sleep(3000);
		
		Thread.sleep(3000);
		System.out.println("after login, title is:..."+ driver.getTitle());*/

	}

}
