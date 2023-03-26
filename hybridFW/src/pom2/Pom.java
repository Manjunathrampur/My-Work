package pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom 
{
@FindBy(xpath="//input[@name='email']")
private WebElement unT;
@FindBy(id="pass")
private WebElement pwdT;
@FindBy(name="login")
private WebElement Loginbtn;
@FindBy(xpath = "(//span[.='Photo/video'])[1]")
private WebElement Photo;


public Pom(WebDriver driver)
{
PageFactory.initElements(driver, this);
}

public void username(String un) 
{
unT.sendKeys(un);	
} 
public void password(String pwd) 
{
pwdT.sendKeys(pwd);	
}
public void button() 
{
Loginbtn.click();
}
public void photoBTN() 
{
	Photo.click();
}






}