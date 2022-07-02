package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example7_AssertClass6_assertNotNull 
{
	@Test
	public void assertNotNull()
	{
		
		String actRes=null;
		Assert.assertNotNull(actRes,"Failed:actResult is null");
	}
}
