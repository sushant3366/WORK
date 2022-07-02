package Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_without_DDF 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium1\\chromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
		//enter username
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("THM944");
		
		//enter password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Bisen@7566");
		
		//click on Login button
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
		
		//enter pin
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("812073");
		
		//clicl on continue button
		driver.findElement(By.xpath("//button[text()='Continue ']")).click();
		
		//get act user id
		String actualUserID = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
		
		String expectedUserID="THM944";
		if(actualUserID.equals(expectedUserID))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		Thread.sleep(3000);
		
		driver.close();

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}






}