package Excel_Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example8getAllData 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream file = new FileInputStream("C:\\Users\\DELL\\Desktop\\Selenium1\\demo Excel\\getsize.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
		
		int rowIDX = sh.getLastRowNum();
		
		int cellIDX = sh.getRow(0).getLastCellNum()-1;
		for(int i=0;i<=rowIDX;i++)
		{
			for(int j=0;j<=cellIDX;j++)
			{
				String v1 = sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(v1+" ");
			}
			
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
	}
}
