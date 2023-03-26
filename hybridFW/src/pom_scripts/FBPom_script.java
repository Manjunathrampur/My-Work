package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBPom_script
{
@FindBy(xpath="//input[@name='email']")
private WebElement unT;
@FindBy(id="pass")
private WebElement pwdT;
@FindBy(name="login")
private WebElement Loginbtn;
@FindBy(xpath = "(//span[.='Photo/video'])[1]")
private WebElement Photo;


public FBPom_script(WebDriver driver)
{
PageFactory.initElements(driver, this);
}

public void username(double uname) 
{
unT.sendKeys();	
} 
public void password(double pass) 
{
pwdT.sendKeys();	
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
