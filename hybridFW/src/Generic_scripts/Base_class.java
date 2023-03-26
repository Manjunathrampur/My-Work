package Generic_scripts;

import java.util.concurrent.TimeUnit;

import javax.naming.spi.DirStateFactory.Result;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Generic_scripts.Framework_constants;

public class Base_class implements Framework_constants
{
	public WebDriver driver;
@BeforeMethod
public void openAppln()
{
System.setProperty(gecko_key, gecko_value)	;
driver=new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get(URL);
}
@AfterMethod
public void closeAppln()
{
	
driver.close();	
}
}




