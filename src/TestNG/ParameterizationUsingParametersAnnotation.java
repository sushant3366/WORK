package TestNG;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationUsingParametersAnnotation 
{
	WebDriver driver;
	
	@Parameters("keyword")
	@Test
	public void Parameterising(String keyword)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\DELL\\\\\\\\Desktop\\\\\\\\Selenium1\\\\\\\\chromeDriver\\\\\\\\chromedriver_win32 (2)\\\\\\\\chromedriver.exe");
	
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://www.google.co.in/");
		WebElement searchBox=driver.findElement(By.name("q"));
		
		searchBox.sendKeys(keyword);
		
		System.out.println("The search keyword entered is : " +keyword);
		
		Assert.assertTrue(searchBox.getAttribute("value").equalsIgnoreCase(keyword));
		
		driver.quit();
	}
	
}
