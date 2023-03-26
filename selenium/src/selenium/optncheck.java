package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class optncheck 
{
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "./softweres/geckodriver.exe");
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/r.php");
	WebElement ele = driver.findElement(By.xpath("//select[@id='month']"));
    Select s = new Select(ele);
    List<WebElement> optn = s.getOptions();
    ArrayList<String>l=new ArrayList<String>();
    for ( WebElement t : optn)
    {
	String x = t.getText();	
	l.add(x);
	l.remove("Nov");
	}
   // if (l.contains("Nov")) 
    //{
	//System.out.println("present");	
	//} else {
//System.out.println("no");
	//}
    for (String t1 : l) {
		System.out.println(t1);
	}
    
}
}
