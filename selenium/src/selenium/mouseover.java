package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseover {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softweres/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath("(//div[.='Fashion'])[4]"));
	Actions act=new Actions(driver);
	act.moveToElement(ele).perform();

}
}
