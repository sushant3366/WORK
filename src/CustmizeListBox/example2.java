package CustmizeListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\Selenium1\\chromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		
		//click on create new acc link
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(2000);
		
		//step1:
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	
		//step2: 
		Actions act =new Actions(driver);
	
		//step3:
		act.click(month);
		
		Thread.sleep(2000);
		
		//navigate to Aug
		for(int i=1;i<=5;i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
		}
		
		Thread.sleep(2000);
		//select option
		act.sendKeys(Keys.ENTER).perform();
			
			
			
			
			

	
	
	
	
	
	
	
	
	
	
	
	}
}