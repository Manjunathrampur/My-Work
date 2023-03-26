package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hrefvalue {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softweres/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(4000);
		List<WebElement> link = driver.findElements(By.xpath("//a"));
		for (WebElement x : link) 
		{
		String y = x.getAttribute("href")	;
		System.out.println(y);
		}
		driver.close();
		
	}
}
