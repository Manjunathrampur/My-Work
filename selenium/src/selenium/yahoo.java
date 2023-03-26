package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahoo
{
	public static void main(String[] args) throws InterruptedException 
	{

	System.setProperty("webdriver.chrome.driver","./softweres/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://in.mail.yahoo.com/d/folders/1?guce_referrer=aHR0cHM6Ly9sb2dpbi55YWhvby5jb20v&guce_referrer_sig=AQAAAKueIxuUt0Z5kAz7q_SXNlJl6iMny6pzbJRS3WqM-t_H2UjusQ_P_varcctBN4Rkic9RYmE8Z8Rdmo9itLJE7ZYpwZ3qkEKxt83822xkHuaRvF66eLvydHyOonzLhdh-XIqUDPyUJfAIRxwtGsNgHZbxg3NYPFn2-mZI4b0YrgQD");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("gjgugsjskk@yahoo.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12566");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	for(int i=1;i<5;i++)
	{
	driver.findElement(By.xpath("//a[@data-test-id='compose-button']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='message-to-field']")).sendKeys("xyanzvjjd@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@data-test-id='compose-subject']")).sendKeys("CALL LETTER");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@aria-label='Message body']")).sendKeys("YOUR JOINING DATE 5-10-2022");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@title='Send this email']")).click();
	} 
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@role='presentation']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@id='profile-signout-link']")).click();
	
	
	driver.quit(); 
	}
}
