package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class url
{
	public static void main(String[] args) throws InterruptedException 
	{

	System.setProperty("webdriver.chrome.driver","./softweres/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.irctc.com");
	Thread.sleep(3000);
	String x=driver.getCurrentUrl();
	String y=driver.getTitle();
	String z=driver.getPageSource();
	System.out.println(y);
	System.out.println(z);
	System.out.println(x);
	driver.close();
	}
	
}
