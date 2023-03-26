package selenium;

import java.rmi.server.SocketSecurityException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softweres/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("12355");
		Thread.sleep(2000);
		
		driver.findElement(By.id("pass")).sendKeys("138569");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(4000);
String		title=driver.getTitle();
System.out.println(title);
if(title.equals("Facebook"))
{
System.out.println("title matchs");	
}
else
{
System.out.println("title miss matchs");	
}

}
}