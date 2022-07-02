package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example7_AssertClass7 
{
	@Test
	public void TC()
	{
		String actResult="hii";
		String expResult="hello";
	
		Assert.assertEquals(actResult, expResult,"--Failed:Both result are diff");
		
		boolean actResult1=false;
		Assert.assertTrue(actResult1,"Failed:actResult is false");
	}
}
//Here comment of second task is not showing on console bcz hard assertion