package selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
FileInputStream fis=new FileInputStream("./excel/Book12.xlsx");	
 Workbook book = WorkbookFactory.create(fis);
 Sheet sh = book.getSheet("sheet1");
 Row r = sh.getRow(1);
 Cell cel = r.getCell(0);
  double value = cel.getNumericCellValue();
 System.out.println(value);


}
}
