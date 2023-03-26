package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scrool {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softweres/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
        Thread.sleep(2000);
         WebElement ele = driver.findElement(By.xpath("//a[text()='Facebook']"));
        Thread.sleep(2000);
        Point loc = ele.getLocation();
        System.out.println(loc);
        int x = loc.getX();
        int y = loc.getY();
        Thread.sleep(2000);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        Thread.sleep(2000);
       js.executeScript("window.scrollBy("+x+","+y+")");
       Thread.sleep(3000);
       ele.click();        
	
	}

}
