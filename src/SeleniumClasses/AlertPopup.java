package SeleniumClasses;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
driver.findElement(By.name("proceed")).click();
Thread.sleep(5000);//this statement is to wait for 5 seconds

Alert alert=driver.switchTo().alert();
System.out.println(alert.getText());

String text=alert.getText();
if(text.equals("Please enter a valid user name")) {
	System.out.println("it's correct");
}else
{
	System.out.println("it's incorrect");
}
alert.accept();

	}


}
