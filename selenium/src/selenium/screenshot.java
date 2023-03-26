package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class screenshot
{
public static void main(String[] args) throws IOException {
	
	System.setProperty("webdriver.gecko.driver", "./softweres/geckodriver.exe");
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://stagenget.irctc.co.in/nget/train-search");
	TakesScreenshot tss=(TakesScreenshot)driver;
	File src = tss.getScreenshotAs(OutputType.FILE);
	File dst=new File("C:\\failed_tc\\f1.jpeg");
	FileUtils.copyFile(src, dst);
	driver.close(); 
	
}
}

