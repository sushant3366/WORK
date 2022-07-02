package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class examplew_Parallel 
{
	@Test
	public void OpenKiteApp() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Desktop\\\\Selenium1\\\\chromeDriver\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	Thread.sleep(3000);
	driver.close();
}
}