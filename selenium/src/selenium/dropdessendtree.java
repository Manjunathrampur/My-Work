package selenium;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdessendtree 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./softweres/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php");
		WebElement ele = driver.findElement(By.xpath("//select[@id='month']"));
	    Select s = new Select(ele);
	    List<WebElement> optn = s.getOptions();
	    TreeSet<String>t=new TreeSet<String>(Collections.reverseOrder());
	    
	    for ( WebElement we : optn) 
	    {
		String t1 = we.getText();	
		t.add(t1);
	
		}
	    for (String t2 : t)
	    {
		System.out.println(t2);	
		}
}
	
}
