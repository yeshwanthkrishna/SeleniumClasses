package SeleniumClasses;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlewindowpopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://popuptest.com/");
		driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]/font[1]/b/a")).click();
		Set<String> handler=driver.getWindowHandles();
		Iterator<String> it=handler.iterator();
		String parentwindowid=it.next();
		System.out.println("parent window id"+parentwindowid);
		String childwindowid=it.next();
		System.out.println("child window id"+childwindowid);
		
		driver.switchTo().window(childwindowid);
		System.out.println("childwindowid"+driver.getTitle());
		driver.close();
		driver.switchTo().window(parentwindowid);
		System.out.println("parentwindowid"+driver.getTitle());
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/b/form/input")).click();
		
		
		
		
	}

}
