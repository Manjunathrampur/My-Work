package pomscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FBlogin 
{
@Test
public void test1()
{
System.setProperty("webdriver.chrome.driver", "./soft/chromedriver.exe")	;
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/login.php/");
POMconcept1 p = new POMconcept1(driver);
p.userName("8");
p.password("4");
p.clicklogin();
}
}
