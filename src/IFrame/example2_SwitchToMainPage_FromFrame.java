package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_SwitchToMainPage_FromFrame 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\Selenium1\\chromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//switvh to frame
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click();
		
		Thread.sleep(2000);
		
		//switch to main page
//		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		
		//click on home icon from main page
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		
		
		
		
	}
	
}
