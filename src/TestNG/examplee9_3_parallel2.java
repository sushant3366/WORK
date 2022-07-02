package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class examplee9_3_parallel2 
{
	@Test
	public void OpenFacebookApp() throws InterruptedException 
	{
		
			System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Desktop\\\\Selenium1\\\\chromeDriver\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/");

			Thread.sleep(3000);
			driver.close();
	
	
	}
}