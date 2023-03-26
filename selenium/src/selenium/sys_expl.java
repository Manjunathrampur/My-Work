package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sys_expl 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.gecko.driver","./softweres/geckodriver.exe");
	FirefoxDriver driver=new FirefoxDriver();
    driver.get("https://www.facebook.com/");
	driver.findElement(By.cssSelector("input[id='email']")).sendKeys("123345");
	driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("12346");
	WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));
	btn.click();
	WebDriverWait wait=new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.titleContains("Facebook"));
	String t = driver.getTitle();
	System.out.println(t);
}	
}

