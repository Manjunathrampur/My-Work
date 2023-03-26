package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class youtubexpath
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./softweres/geckodriver.exe");
   WebDriver	driver=new FirefoxDriver();
   driver.get("https://www.youtube.com/");
   Thread.sleep(2000);
   driver.findElement(By.xpath("//input[@id='search']")).sendKeys("kgf movie songs kannada ");
   Thread.sleep(2000);
   driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
   Thread.sleep(2000);
   driver.findElement(By.xpath("//a[@title='Mehabooba Video Song (Kannada) | KGF Chapter 2 | RockingStar Yash | Prashanth Neel | Ravi Basrur']")).click();
   Thread.sleep(2000);
   driver.findElement(By.xpath("//button[@class='style-scope yt-icon-button' and @aria-label='like this video along with 170,744 other people']")).click();
}}


