package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class googlemap {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softweres/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/maps/@21.125498,81.914063,5z");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='eYqqWd']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']")).sendKeys("Bangalore");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Choose destination...']")).sendKeys("bagalkot");

}
}
