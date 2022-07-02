package TestNG1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Day2
{
	
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
