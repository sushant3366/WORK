package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example5_keyword3_Priority1 
{
	@Test(priority = 1)
	public void TC2()
	{
		Reporter.log("running TC2",true);
	}
	
	@Test(priority = 2)
	public void TC3()
	{
		Reporter.log("running TC3",true);
	}
	@Test(priority = 3)
	public void TC1()
	{
		Reporter.log("running TC1",true);
	}
	@Test
	public void TC5()                     //by default priority=0 , duplicate priority
	{
		Reporter.log("running TC5",true);
	}
	@Test
	public void TC6()                     //by default priority=0 , duplicate priority
	{
		Reporter.log("running TC6",true);
	}
	@Test
	public void TC4()                      //by default priority=0 , duplicate priority
	{
		Reporter.log("running TC4",true);
	}
}
