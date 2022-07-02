package Excel_Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example_readNumericDataAsString 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\DELL\\Desktop\\Selenium1\\demo Excel\\getsize.xlsx");
	
		String data = WorkbookFactory.create(file).getSheet("Sheet3").getRow(2).getCell(0).getStringCellValue();
		                                      //to make num data to string in excel-use '100 instead 100
		                                      // it will internally convert numeric to string
	
		System.out.println(data);
	
	
	
		
	
	
	
	}
}
