package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class examplee9_2_grouping1 
{
	@Test(groups = "login")
	public void TC1()
	{
		Reporter.log("running TC1",true);
	}
	
	@Test(groups = "profile")
	public void TC2()
	{
		Reporter.log("running TC2",true);
	}
	
	@Test(groups = "funds")
	public void TC3()
	{
		Reporter.log("running TC3",true);
	}
	
	@Test(groups = "funds")
	public void TC4()
	{
		Reporter.log("running TC4",true);
	}
}
