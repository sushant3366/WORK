package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ShoeErrorMessage 
{
	public static void main(String[] args) throws IOException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium1\\chromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("7852556582");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abcs1234");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\DELL\\Pictures\\SeleniumScreenshots\\pqr.jpg");
		FileHandler.copy(source, des);
		
		System.out.println(driver.findElement(By.xpath("//div[@class='_9ay7']")).getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
