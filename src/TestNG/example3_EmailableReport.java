package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example3_EmailableReport 
{
	
	@Test                 //test case or test method
	public void TC1()     //TC name TC1
	{
		Reporter.log("Running TC1");
	}
	
	@Test
	public void TC2()
	{
		Reporter.log("Running TC2");
	}
	
	
}
