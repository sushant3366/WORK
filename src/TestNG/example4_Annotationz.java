package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class example4_Annotationz
{
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("OpenBrowserApp",true);
	}
	
	@BeforeMethod
	public void loginToApp()
	{
		Reporter.log("logintoApp",true);
	}
	
	@Test
	public void verifyUserID()
	{
		Reporter.log("----Running verifyUserID TC--",true);
	}
	
	@Test
	public void verifyUserID1()
	{
		Reporter.log("--Running verifyUserID1 TC--",true);
	}
	
	@AfterMethod
	public void logOutApp()
	{
		Reporter.log("LogOutApp",true);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("CloseBrowser",true);
	}
}
