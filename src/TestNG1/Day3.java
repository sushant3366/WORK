package TestNG1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Day3
{
	@Test
	public void Logout()
	{
		Reporter.log("running logout",true);
	}
	
	@Test
	public void account()
	{
		Reporter.log("running account",true);
	}
	
}
