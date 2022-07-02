package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example4_Annotations
{
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
}
