package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class popupalert
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.gecko.driver", "./softweres/geckodriver.exe");	
WebDriver driver=new FirefoxDriver();
driver.get("http://demo.guru99.com/test/delete_customer.php");
driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("admin");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='submit']")).click();
Alert a = driver.switchTo().alert();
String t = a.getText();
System.out.println(t);
Thread.sleep(2000);
a.dismiss();

}
}
 