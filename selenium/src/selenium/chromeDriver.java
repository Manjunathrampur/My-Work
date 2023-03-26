package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class chromeDriver {
public static void main(String[] args) 
{
String key="webdriver.chrome.driver";
String value="./softweres/chromedriver.exe";
System.setProperty(key,value);
ChromeDriver driver=new ChromeDriver();
}
}