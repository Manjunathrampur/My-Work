package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cssfire 
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./softweres/geckodriver.exe");
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(4000);
	driver.findElement(By.cssSelector("input[id='email']")).sendKeys("123456");
	driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("cbghfyui");
	WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));
	if (btn.isDisplayed()) {
	if (btn.isEnabled()) {
		btn.click();
	}
	else{
		System.out.println("not enable");
	}
	}
	else{
		
		System.out.println("not");
	}
}
}
