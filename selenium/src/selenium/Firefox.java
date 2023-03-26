package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./softweres/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Dell/Desktop/1cb.html");
		WebElement cbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		Thread.sleep(2000);
		if (cbox.isSelected()) {
			System.out.println("selected");
		}
		else{
			cbox.click();
		}

	}

}
