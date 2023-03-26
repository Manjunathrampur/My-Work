package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Instamsgsend
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./softweres/geckodriver.exe" )	;
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("8884558578");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("414414414");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[.='Messages'and @class='_aacl _aacp _aacw _aacx _aada']")).click();
}
}
