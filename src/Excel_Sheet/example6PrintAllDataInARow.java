package Excel_Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example6PrintAllDataInARow 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\DELL\\Desktop\\Selenium1\\demo Excel\\getsize.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
//		for(int i=0;i<5;i++)
//		{
//			String values = sh.getRow(i).getCell(0).getStringCellValue();
//			System.out.print(values+" ");
//	    }
			
			//OR
		
		int lastRowIndex = sh.getLastRowNum();
		for(int i=0; i<=lastRowIndex;i++)
		{
			String values = sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(values);
		}
		
		
			
		
		
	}
}
