package TestNG;




import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class example5_Keyword5_dependsOnMethod1
{
	@Test
	public void login()
	{	//Assert.fail();
		Reporter.log("Running LoginTC",true);
	}
	
	@Test(dependsOnMethods = {"login"})
	public void logout()
	{
		Reporter.log("Running logoutTC",true);
	}
}
