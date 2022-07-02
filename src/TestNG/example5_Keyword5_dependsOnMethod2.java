package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class example5_Keyword5_dependsOnMethod2
{
	@Test
	public void login1()
	{
		Reporter.log("Running login1TC",true);
	}
	
	@Test 
	public void login2()
	{
		Assert.fail();
		Reporter.log("Running login2TC",true);
	}
	
	@Test(dependsOnMethods = {"login1","login2"})
	public void logout()
	{
		Reporter.log("Running logoutTC",true);
	}
}
