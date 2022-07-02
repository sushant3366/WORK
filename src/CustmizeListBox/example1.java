package CustmizeListBox;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example1 
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
		
		//4A: navigate 1 option to upward using ARROW_UP key
		act.sendKeys(Keys.ARROW_UP).perform();
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
		
		//4B: navigate 1 option to downward using ARROW_DOWN
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		
		//4C: select option using enter key
		act.sendKeys(Keys.ENTER).perform();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}