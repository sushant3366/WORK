package POM_With_DDF_TestNG;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteLoginTest
{
	KiteLoginPage1 login1;
	kiteLogin2Page login2;
	kiteHomePage home;
	Sheet sh;
	WebDriver driver;
	
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\DELL\\Desktop\\Selenium1\\demo Excel\\POM with DDF.xlsx");
		sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL\\\\Desktop\\\\Selenium1\\\\chromeDriver\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
	
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
		
		login1=new KiteLoginPage1(driver);
		login2=new kiteLogin2Page(driver);
		home=new kiteHomePage(driver);
	
	}
	
	@BeforeMethod
	public void LoginToApp()
	{
		login1.inpKiteLoginPage1Username(sh.getRow(0).getCell(0).getStringCellValue());
		login1.inpKiteLoginPage1Password(sh.getRow(0).getCell(1).getStringCellValue());
		login1.ClckKiteLoginPage1Loginbtn();
		
		login2.inpkiteLogin2PagePin(sh.getRow(0).getCell(2).getStringCellValue());
		login2.ClickkiteLogin2PageCntBtn();
	}
	
	@Test
	public void VerifyUserID()
	{
		String actualUserID = home.getKiteHomePageUserID();
		String expUserID = sh.getRow(0).getCell(3).getStringCellValue();
		Assert.assertEquals(actualUserID, expUserID,"Failed:Both results are not equal");

		//home.VerifykiteHomePageUserID(sh.getRow(0).getCell(3).getStringCellValue());
	}
	
	@AfterMethod
	public void LogoutApp()
	{
		
	}
	
	@AfterClass
	public void CloseBrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
}
