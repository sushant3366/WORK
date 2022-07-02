package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example7_AssertClass5_assertNull 
{
	@Test
	public void assertNull()
	{
		
		String actRes="abc";
		Assert.assertNull(actRes,"Failed:actResult is not null");
	}
}
