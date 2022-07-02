package HandlingofAutusuggetions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class example3 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL\\\\Desktop\\\\Selenium1\\\\chromeDriver\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//clicl on close 
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		//click on search box
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi note 11");
		//click on search tab
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		String review = driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[8]")).getText();
		
		System.out.println(review);
		
		System.out.println(driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[3]")).getText());
		System.out.println(driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[4]")).getText());
		System.out.println(driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[6]")).getText());
		System.out.println(driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[9]")).getText());

		WebElement mobile = driver.findElement(By.xpath("(//img[@class='_396cs4 _3exPp9'])[1]"));
		File src = mobile.getScreenshotAs(OutputType.FILE);
		
		 File des = new File("C:\\Users\\DELL\\Pictures\\SeleniumScreenshots\\mobile.jpg");
		
		FileHandler.copy(src, des);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}