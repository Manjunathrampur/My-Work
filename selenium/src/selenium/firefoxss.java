package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firefoxss 
{


	public static void main(String[] args) throws InterruptedException 
	{

	System.setProperty("webdriver.chrome.driver","./softweres/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(4000);
	driver.findElement(By.id("email")).sendKeys("8884558578");
	driver.findElement(By.name("pass")).sendKeys("8884558578");
	driver.findElement(By.xpath("//button[text()='Log in']")).click();
	
}
}
