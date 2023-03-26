package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class textfield
{
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.gecko.driver","./softweres/geckodriver.exe");
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/Dell/Desktop/textfield.html");
	Thread.sleep(4000);
	List<WebElement> textf = driver.findElements(By.xpath("//input"));
	int z = textf.size();
	System.out.println(z);
	for ( WebElement x : textf)
	{
	x.sendKeys("123");	
	}
	Thread.sleep(4000);
	for (int i=z-1; i>=0; i--)
	{
		WebElement y = textf.get(i);
		y.clear();
	}
		
	}


}


