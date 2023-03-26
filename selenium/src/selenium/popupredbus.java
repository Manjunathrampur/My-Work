package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class popupredbus 
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./softweres/geckodriver.exe" )	;
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.redbus.in/?gclid=EAIaIQobChMI17eXhaSj-wIVz51LBR1GFgnGEAAYASAAEgLVovD_BwE");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//td[.='10']")).click();
}
}
