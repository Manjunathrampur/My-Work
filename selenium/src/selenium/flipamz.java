package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flipamz
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./softweres/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
driver.get("https://www.flipkart.com/");
driver.findElement(By.xpath("//button[text()='✕']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("iphone 13");
Thread.sleep(2000);
driver.findElement( By.xpath("//button[@type='submit']")).click();
Thread.sleep(2000);
WebElement cost1 = driver.findElement(By.xpath("//div[.='APPLE iPhone 13 (Green, 128 GB)']/../../div[2]/div[1]/div[1]/div[1]"));
String x = cost1.getText();
x=x.replace("₹", "");
x=x.replace(",", "");
System.out.println(x);




driver.get("https://www.amazon.in/");
driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("APPLE iPhone 13 (Green, 128 GB)");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
Thread.sleep(2000);
WebElement cost2 = driver.findElement(By.xpath("//span[.='Apple iPhone 13 (128GB) - Green']/../../../following-sibling::div[2]/div[1]/div[1]/div[1]/div[1]/a/span[1]/span[2]/span[2]"));
String y = cost2.getText();
y=y.replace(",", "");
System.out.println(y);
int amazon = Integer.parseInt(y);
int flip = Integer.parseInt(x);
if(flip==amazon)
{
System.out.println(" equal");	
}else{
	System.out.println("not equal");
}

 

}
}
