package stepDefnitions;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login
{
	public WebDriver driver;
	@Given("open the browser and enter test url")
	public void open_the_browser_and_enter_test_url() 
	{
	  System.setProperty("webdriver.gecko.driver", "./soft/geckodriver.exe");
	  driver = new FirefoxDriver();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get("https://www.facebook.com");
	}

	@Then("login page should be displayed")
	public void login_page_should_be_displayed() 
	{
	   String title = driver.getTitle();
	   Assert.assertEquals(title, "Facebook – log in or sign up");
	}

	@When("user enters valid credentials")
	public void user_enters_valid_credentials()
	{
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("");
	  driver.findElement(By.id("pass")).sendKeys("");
	}

	@And("click on login button")
	public void click_on_login_button()
	{
      driver.findElement(By.xpath("//button[@name='login']")).click();
	}

	@Then("home page should be displayed")
	public void home_page_should_be_displayed() 
	{
		String title = driver.getTitle(); 
		Assert.assertEquals(title, "Facebook");
	}

}
