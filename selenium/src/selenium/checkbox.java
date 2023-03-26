package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkbox
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver","./softweres/geckodriver.exe");
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/Dell/Desktop/checkbox.html");
	Thread.sleep(4000);
	List<WebElement> checkb = driver.findElements(By.xpath("//input"));
	int count = checkb.size();
	System.out.println(count);
	for (int i = 0; i <count; i++) 
	{
	WebElement c1 = checkb.get(i);
	c1.click();
	Thread.sleep(400);
		
	}
	for (int j =count-1; j>=0; j--)
		
	{
		WebElement c10 = checkb.get(j);
		c10.click();
		Thread.sleep(400);
	}
	
	
	
	
}
}
