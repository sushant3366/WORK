package Excel_Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example9VerifyTypeOfCell 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\DELL\\Desktop\\Selenium1\\demo Excel\\getsize.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet6");
		
		CellType type = sh.getRow(2).getCell(0).getCellType();
	
		System.out.println(type);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
