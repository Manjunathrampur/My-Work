package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class fbdrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./softweres/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php");
		WebElement ele = driver.findElement(By.xpath("//select[@id='year']"));
	    Select s = new Select(ele);
	    List<WebElement> optn = s.getOptions();
	    //int count = optn.size();
	   // System.out.println(count);
	    for (WebElement x : optn)
	    {
		String y = x.getText();	
		System.out.println(y);
		}
	
	}

}
