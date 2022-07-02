package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example4_mouseDoubleClickAction
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium1\\chromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement doubleClick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click ')]"));
		
		Actions act=new Actions(driver);
		
		
		act.doubleClick(doubleClick).perform();
		
//		act.moveToElement(element).doubleClick().build().perform();	
		
//		act.moveToElement(element).perform();
//		act.doubleClick().perform();
		
		
		
	}
}
