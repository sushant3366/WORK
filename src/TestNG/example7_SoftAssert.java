package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class example7_SoftAssert 
{
	@Test
	public void TC()
	{
		SoftAssert soft=new SoftAssert();
		String actResult="hii";
		String expResult="hello";
	
		soft.assertEquals(actResult, expResult,"--Failed:Both result are diff");
		
		boolean actResult1=false;
		soft.assertTrue(actResult1,"Failed:actResult is false");
		
		soft.assertAll();
	}
}
