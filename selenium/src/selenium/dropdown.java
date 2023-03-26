package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softweres/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Dell/Desktop/dropdown.html");
		Thread.sleep(4000);
		WebElement dd = driver.findElement(By.id("shreya"));
		Select ele = new Select(dd);
		ele.selectByIndex(1);
		//Thread.sleep(4000);
		//ele.selectByValue("C");
		//Thread.sleep(4000);
		//ele.selectByVisibleText("mutton 5 piece");
		//Thread.sleep(4000);
		//ele.deselectAll();
		boolean b = ele.isMultiple();
		if (b)
		{
		System.out.println("yes it is");	
		}
		else{
			System.out.println("its not multiple");
		}
		
	}

}
