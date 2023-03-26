package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sych_imp
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver","./softweres/geckodriver.exe");
	FirefoxDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	driver.findElement(By.cssSelector("input[id='email']")).sendKeys("123456");
	driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("123456");
	WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));
	btn.click();
	String t = driver.getTitle();
	System.out.println(t);
}

}