package log4j;

import java.util.concurrent.TimeUnit;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		Logger logger=Logger.getLogger("demo");
		PropertyConfigurator.configure("log4j.properties");
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\DELL\\\\\\\\Desktop\\\\\\\\Selenium1\\\\\\\\chromeDriver\\\\\\\\chromedriver_win32 (2)\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		logger.info("Opening browser");
		
		driver.manage().window().maximize();
		logger.info("maximizing");
		Thread.sleep(3000);
		driver.manage().window().minimize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
		logger.info("app launch");
		
		//enter username
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("THM944");
		logger.info("sending uID");
		
		//enter password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Bisen@7566");
		logger.info("send password");
		
		//click on Login button
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
		logger.info("click");
		
		//enter pin
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("812073");
		logger.info("entering pin");
		
		//clicl on continue button
		driver.findElement(By.xpath("//button[text()='Continue ']")).click();
		logger.info("continue");
		
		//get act user id
		String actualUserID = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
		logger.info("gettext");
		String expectedUserID="THM944";
//		if(actualUserID.equals(expectedUserID))
//		{
//			System.out.println("pass");
//		}
//		else
//		{
//			System.out.println("fail");
//		}
//		Thread.sleep(3000);
		
		driver.close();

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	private static Logger LogManager(String name) {
		// TODO Auto-generated method stub
		return null;
	}






}