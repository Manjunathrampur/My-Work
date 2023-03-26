package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class youtube
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softweres/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[id='search']")).sendKeys("kantara trailer");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(4000);
		driver.findElement(By.partialLinkText("Kantara")).click();
}
}
