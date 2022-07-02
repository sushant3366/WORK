package POM_With_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
  //Test class
public class kiteLoginTest 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		
		FileInputStream file=new FileInputStream("C:\\Users\\DELL\\Desktop\\Selenium1\\demo Excel\\POM with DDF.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL\\\\Desktop\\\\Selenium1\\\\chromeDriver\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
	
	
		KiteLoginPage1 login1=new KiteLoginPage1(driver);
		login1.inpKiteLoginPage1Username(sh.getRow(0).getCell(0).getStringCellValue());
		login1.inpKiteLoginPage1Password(sh.getRow(0).getCell(1).getStringCellValue());
		login1.ClckKiteLoginPage1Loginbtn();
		
		kiteLogin2Page login2=new kiteLogin2Page(driver);
		login2.inpkiteLogin2PagePin(sh.getRow(0).getCell(2).getStringCellValue());
		login2.ClickkiteLogin2PageCntBtn();
		
		kiteHomePage home=new kiteHomePage(driver);
		home.VerifykiteHomePageUserID(sh.getRow(0).getCell(3).getStringCellValue());
		
		Thread.sleep(2000);
		driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
