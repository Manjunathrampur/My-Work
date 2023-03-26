package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flipkart
{

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./softweres/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/bank-terms-and-conditions-store");
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("puma shoes");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@src='https://rukminim1.flixcart.com/image/495/594/xif0q/shoe/w/2/o/6-387637-6-puma-white-gray-violet-black-original-imaghbgnnpjujyck.jpeg?q=50']")).click();
	
	}}