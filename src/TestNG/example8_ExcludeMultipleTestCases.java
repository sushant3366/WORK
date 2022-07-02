package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example8_ExcludeMultipleTestCases
{
	@Test
	public void login1()
	{
		Reporter.log("running login1",true);
	}
	
	@Test
	public void login2()
	{
		Reporter.log("running login2",true);
	}
	
	@Test
	public void profile()
	{
		Reporter.log("running profile",true);
	}
	
	@Test
	public void login3()
	{
		Reporter.log("running login3",true);
	}
	
	@Test
	public void login4()
	{
		Reporter.log("running login4",true);
	}
	
	@Test
	public void login5()
	{
		Reporter.log("running login5",true);
	}
	
	@Test
	public void profile2()
	{
		Reporter.log("running profile2",true);
	}
	
	@Test
	public void login6()
	{
		Reporter.log("running login6",true);
	}
	
	@Test
	public void login7()
	{
		Reporter.log("running login7",true);
	}
	
	@Test
	public void logout()
	{
		Reporter.log("running TC5",true);
	}
}
