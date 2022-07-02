package Excel_Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example5_GetColSize 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\DELL\\Desktop\\Selenium1\\demo Excel\\getsize.xlsx");
		int colsize = WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getLastCellNum();
		
		System.out.println(colsize);
	}
}
