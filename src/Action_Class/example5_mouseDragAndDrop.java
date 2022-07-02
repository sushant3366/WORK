package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example5_mouseDragAndDrop 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium1\\chromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");

		WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	
		WebElement des = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));

	
		Actions act=new Actions(driver);
	
		act.dragAndDrop(src, des).perform();
	
	
		//act.moveToElement(src).clickAndHold().moveToElement(dest).release().build().perform()
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}