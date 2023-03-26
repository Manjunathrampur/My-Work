package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css
{
	public static void main(String[] args) throws InterruptedException 
	{

	System.setProperty("webdriver.chrome.driver","./softweres/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(4000);
	driver.findElement(By.cssSelector("input[id='email']")).sendKeys("123456");
}
}