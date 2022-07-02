package POM_DDF_TestNG_BaseClass_UtilityClass_FailedTCes_Screenshots_PropertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	//This method is use to get TestData from excel sheet
		//need to pass 2 parameters: 1:rowIndex  2:colIndex
		//Author name: Sanjay
	public static String getTD(int RowINDX, int CollINDX) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\ClassWork\\TestData\\POM with DDF.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	
		String value = sh.getRow(RowINDX).getCell(CollINDX).getStringCellValue();
		return value;
	}
	
	public static void captureScreenshot(WebDriver driver,int TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\DELL\\eclipse-workspace\\ClassWork\\Screenshots\\Testcase"+TCID+".jpg");
		FileHandler.copy(src, dest);
		
	}
	
	public static String getPFData(String key) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\ClassWork\\Propertyfile.properties");
		Properties p=new Properties();
		p.load(file);
		String value = p.getProperty(key);
		return value;
	
	
	
	
	}
}
