package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example7_AssertClass2_assertNotEquals 
{
	@Test
	public void assertEquals()
	{
		String actResult="hii";
		String expResult="hii";
	
		Assert.assertNotEquals(actResult, expResult,"--Failed:Both result are same");
	
}
}