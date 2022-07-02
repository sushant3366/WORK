package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class example4_ScreenshotofPArticularArea 
{
	public static void main(String[] args) throws IOException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium1\\chromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement section = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		
		File src = section.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\DELL\\Pictures\\SeleniumScreenshots\\FacebookLogo.jpg");
		
		FileHandler.copy(src, des);
}
}