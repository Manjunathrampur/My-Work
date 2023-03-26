package pom2;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic111
{
public WebDriver driver;
@BeforeMethod
public void openappl() throws InterruptedException
{
System.setProperty("webdriver.chrome.driver", "./soft/chromedriver.exe");
driver=new ChromeDriver();
Thread.sleep(2000);
driver.manage().window().maximize();
driver.get("https://www.facebook.com/login/");


}
@AfterMethod
public void closeappln()
{
driver.close();
}

}
