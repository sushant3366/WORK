package TestNG;

import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class example8_DisableTCExecutionFrom_TestClass
{
	@Test
	public void TC1()
	{
		Reporter.log("running TC1",true);
	}
	
	@Test(enabled=false)
	public void TC2()
	{
		Reporter.log("running TC2",true);
	}
	
	@Test
	public void TC3()
	{
		Reporter.log("running TC3",true);  
		throw new SkipException("Skipped TC3");  //It will not disable testcase but skip it
	}
}
