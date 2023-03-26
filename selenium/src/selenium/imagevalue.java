package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElements;

public class imagevalue {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./softweres/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		List<WebElement> aa = driver.findElements(By.xpath("//img"));
		for (WebElement bb : aa)
		{
		String m = bb.getAttribute("src");	
		System.out.println(m);
		}
	}

}
