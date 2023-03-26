package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mapchrome
{


	public static void main(String[] args) throws InterruptedException 
	{

	System.setProperty("webdriver.chrome.driver","./softweres/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/maps/@12.9989812,77.5504667,15z");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//img[@class='eYqqWd']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']")).sendKeys("Bangalore");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Choose destination, or click on the map...']")).sendKeys("bagalkot");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Search']")).click();

}	
}

