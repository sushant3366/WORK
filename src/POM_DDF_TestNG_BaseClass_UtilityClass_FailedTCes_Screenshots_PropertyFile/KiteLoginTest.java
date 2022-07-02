package POM_DDF_TestNG_BaseClass_UtilityClass_FailedTCes_Screenshots_PropertyFile;

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
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteLoginTest extends BaseClass
{
	
	KiteLoginPage1 login1;
	kiteLogin2Page login2;
	kiteHomePage home;
	int TCID;
	
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException
	{
		initilizeBrowser();
		
		login1=new KiteLoginPage1(driver);
		login2=new kiteLogin2Page(driver);
		home=new kiteHomePage(driver);
	
	}
	
	@BeforeMethod
	public void LoginToApp() throws EncryptedDocumentException, IOException
	{
		login1.inpKiteLoginPage1Username(UtilityClass.getPFData("UesrID"));
		login1.inpKiteLoginPage1Password(UtilityClass.getPFData("Password"));
		login1.ClckKiteLoginPage1Loginbtn();
		
		login2.inpkiteLogin2PagePin(UtilityClass.getPFData("Pin"));
		login2.ClickkiteLogin2PageCntBtn();
	}
	
	@Test
	public void VerifyUserID() throws EncryptedDocumentException, IOException
	{
		TCID = 101;
		String actualUserID = home.getKiteHomePageUserID();
		String expUserID = UtilityClass.getTD(0, 3);
		Assert.assertEquals(actualUserID, expUserID,"Failed:Both results are not equal");

		//home.VerifykiteHomePageUserID(sh.getRow(0).getCell(3).getStringCellValue());
	}
	
	@AfterMethod
	public void LogoutApp(ITestResult s1) throws IOException
	{
		TCID = 101;
		if(s1.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass.captureScreenshot(driver, TCID);
		}
	}
	
	@AfterClass
	public void CloseBrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
}
