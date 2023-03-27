package pomscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMconcept1
{
@FindBy(id="email")
private WebElement unTbox;
@FindBy(name="pass")
private WebElement pwdTbox;
@FindBy(name="login")
private WebElement LoginBtn;
public POMconcept1(WebDriver driver) 
{

	PageFactory.initElements(driver, this);
}
public void userName(String un)
{
unTbox.sendKeys(un);	

}
public void password(String pwd)
{
pwdTbox.sendKeys(pwd);	
}
public void clicklogin()
{
LoginBtn.click();	
}
}
