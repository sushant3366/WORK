package TestNGListners;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(TestNGListners.listners.class)   //here we have implemented this in class level but it is not recommendet as we can use it in suite level to get benifit for all classes
public class MyfirstTestCaseA1
{

	@Test
	public void GoogleTitleVerify()
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium1\\chromeDriver\\chromedriver_win32 (2)\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
	}
	
	@Test
	public void DuumyTC()
	{
		System.out.println("dummy tc");
		Assert.assertTrue(false);
	}
}
