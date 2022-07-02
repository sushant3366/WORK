package CustmizeListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example4_selectOptionUsingEndKeys 
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

		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	
		
		Actions act=new Actions(driver);
		
		act.click(month);

		act.sendKeys(Keys.END).perform();
		
		for(int i=1;i<=4;i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
		}
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
	
	
	
	
	
	
	
	
	
	
	}
}