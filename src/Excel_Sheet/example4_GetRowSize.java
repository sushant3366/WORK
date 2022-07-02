package Excel_Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example4_GetRowSize 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\DELL\\Desktop\\Selenium1\\demo Excel\\getsize.xlsx");
	
	int rowsize = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum()+1;
	                                                               //indexSize+1
	
	System.out.println(rowsize);
	
	
	
	
	
	
	
	}
}
