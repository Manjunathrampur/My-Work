package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softweres/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("APPLE iPhone 13 (Green, 128 GB)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(2000);
		WebElement cost2 = driver.findElement(By.xpath("//span[.='Apple iPhone 13 (128GB) - Green']/../../../following-sibling::div[2]/div[1]/div[1]/div[1]/div[1]/a/span[1]/span[1]"));
		String y = cost2.getText();
		System.out.println(y);
	}
	
	
	
	
	//span[.='Apple iPhone 13 (128GB) - Green']/../../../following-sibling::div[2]/div[1]/div[1]/div[1]/div[1]/a/span[1]/span[1]

}
