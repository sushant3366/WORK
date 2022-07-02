package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxes 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\DELL\\\\\\\\Desktop\\\\\\\\Selenium1\\\\\\\\chromeDriver\\\\\\\\chromedriver_win32 (2)\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		System.out.println(checkboxes.size());
		
		//select all checkboxes
//method 1
		/*for(int i=0;i<=checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}*/

		
//method 2
//		for(WebElement s1:checkboxes)
//		{
//			s1.click();
//		}
		
		
//select only monday and friday
//		for(WebElement s1:checkboxes)
//		{
//			String value = s1.getAttribute("id");
//			if(value.equals("monday") || value.equals("friday"))
//			{
//				s1.click();
//			}
//		}
	
		
//select last two checkbox     * IMP *
		int size = checkboxes.size();
//		for(int i=size-2;i<size;i++)
//		{
//			checkboxes.get(i).click();
//		}
		
//select first two checkboxes
		for(int i=0;i<size;i++)
		{
			if(i<2)
			checkboxes.get(i).click();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}