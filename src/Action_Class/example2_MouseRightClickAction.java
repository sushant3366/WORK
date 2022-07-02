package Action_Class;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example2_MouseRightClickAction 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium1\\chromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		
		//step1:
		WebElement loginEle = driver.findElement(By.xpath("//a[text()='Login']"));
		//step2:
		Actions act=new Actions(driver);
		//step3:
		act.contextClick(loginEle).perform();
		//OR
		//act.moveToElement(moreEle).contextClick().build().perform();
		//OR
//		act.moveToElement(moreEle).perform();
//		act.contextClick().perform();
		
		
		
		
		
		
		
		
		
		
}
}