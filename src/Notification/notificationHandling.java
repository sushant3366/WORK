package Notification;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notificationHandling 
{
	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL\\\\Desktop\\\\Selenium1\\\\chromeDriver\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://kite.zerodha.com/");
		
		//enter UN
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("THM944");
		
		//enter pwd
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Bisen@7566");
		
		//click on login btn
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
		
		
		//enter pin
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("812073");
		
		//click on cnt btn
		driver.findElement(By.xpath("//button[text()='Continue ']")).click();
		
		//get act user id
		String actUserID = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
		String expUserId = "THM944";
		
		if(actUserID.equals(expUserId)) 
		{
			System.out.println("Pass");
		}
		else 
		{
			System.out.println("Fail");
		}
		
		Thread.sleep(4000);
		
		
		//driver.close()
}
}