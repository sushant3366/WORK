package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_SwitchtoFrame 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\Selenium1\\chromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//Switch to frame
//		driver.switchTo().frame("iframeResult");        //String Frame Id
//		driver.switchTo().frame("iframeResult");        //String Frame name
//		driver.switchTo().frame(0);                     //int Frame Index
		
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));   //Frame WebElement
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));   //Frame WebElement

		
		//click on date and time btn
		driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click();
		
	}
}
