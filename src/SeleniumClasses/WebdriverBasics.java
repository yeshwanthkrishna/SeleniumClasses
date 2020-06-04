package SeleniumClasses;
//to launch selenium libraries into Eclipse, first we have to download selenium HQ
//java file and then we have to add jar files into our project
//click the right button on our project then go to properties, in the properties go 
//to java build path and then add external JARs.
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebdriverBasics {

	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver" , "C:\\Users\\sai\\Downloads\\geckodriver-v0.18.0-win32\\geckodriver.exe");
		
		//WebDriver driver=new FirefoxDriver();//this statement is to launch firefox
         //driver.get("http://www.google.com");
            // System.out.println(driver.getTitle());
//here firefox driver is child class and webdriver is a parent class referred by 
//driver variable

//How to launch chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();//this statement is to launch chrome
		driver1.get("http://www.google.com");//enter url
		
		String title=driver1.getTitle();
		System.out.println(driver1.getTitle());
		
		//validation
		if(title.equals("Google"))
		{
		System.out.println("its correct");}
		else
		{
			System.out.println("incorrect");
			}
		String url=driver1.getCurrentUrl();
		
		System.out.println(driver1.getCurrentUrl());
		if(url.equals("https://www.google.com/?gws_rd=ssl"))
		{
		System.out.println("correct");
		}
		else
		{
			System.out.println("incorrect");
			
			}
			//System.out.println(driver1.getPageSource());
	}

}