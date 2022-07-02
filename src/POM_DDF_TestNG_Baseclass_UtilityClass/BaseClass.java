package POM_DDF_TestNG_Baseclass_UtilityClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	WebDriver driver;
	
	public void initilizeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL\\\\Desktop\\\\Selenium1\\\\chromeDriver\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
	}
}
