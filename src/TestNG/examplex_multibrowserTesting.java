package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class examplex_multibrowserTesting
{
	@Parameters("browsername")
	@Test
	public void TC1(String browsername)
	{
		
		WebDriver driver=null;
		
		
		if(browsername.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL\\\\Desktop\\\\Selenium1\\\\chromeDriver\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
	    driver=new ChromeDriver();
		}
	    else if (browsername.equals("firefox")) 
	    {
	    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\Selenium1\\firefox driver\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	    	driver=new FirefoxDriver();
		}
	    else if (browsername.equals("edge"))
	    {
	    	System.setProperty("webdriver.edge.driver", "C:\\Users\\DELL\\Desktop\\Selenium1\\Edge driver\\edgedriver_win64 (1)\\msedgedriver.exe");
			driver =new EdgeDriver();
		}
		
		driver.get("https://www.google.co.in");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
	}
}
