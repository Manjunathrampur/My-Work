package Generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Fetcj_properties {
public static String getprop() throws IOException
{
FileInputStream fis=new FileInputStream("C:\\Users\\Dell\\eclipse2-workspace\\Hello\\src\\test\\java\\utils\\globle.properties");
Properties p=new Properties();
p.load(fis);
String var = p.getProperty("baseURI");
return var; 
}
}
