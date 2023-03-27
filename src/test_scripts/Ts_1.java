package test_scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Generic_scripts.Base_class;
import Generic_scripts.Generic_excel;

import pom_scripts.FBPom_script;

public class Ts_1 extends Base_class
{
@Test
public void script() throws EncryptedDocumentException, IOException
{
	 double uname = Generic_excel.getData("Sheet1", 0, 0);
	double pword = Generic_excel.getData("Sheet1", 1, 0);
FBPom_script pmc = new FBPom_script(driver);
pmc.username(uname);
pmc.password(pword);
pmc.button();
pmc.photoBTN();
}
}
