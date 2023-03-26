package Generic_scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_excel
{
public static double getData(String sheet,int row,int cel) throws EncryptedDocumentException, IOException
{
	FileInputStream fis=new FileInputStream("./Poi/Book1.xlsx");
	Workbook book=WorkbookFactory.create(fis);
	Cell cel1 = book.getSheet(sheet).getRow(row).getCell(cel);
	double value = cel1.getNumericCellValue();
			return value;
	
}

}
