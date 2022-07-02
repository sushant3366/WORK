package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example7_AssertClass1_assertEquals
{
	@Test
	public void assertEquals()
	{
		String actResult="hii";
		String expResult="hello";
	
		Assert.assertEquals(actResult, expResult,"--Failed:Both result are diff");
	
	
	
	}
}
