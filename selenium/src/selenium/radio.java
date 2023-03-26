package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radio
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./softweres/geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	Thread.sleep(2000 );
	WebElement rod = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
	Thread.sleep(2000);
	if (rod.isSelected()) 
	{
	System.out.println("selected");	
	}
	else{
		rod.click();
	}
}
}
