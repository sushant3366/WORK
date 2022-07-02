package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example4_DeselectMultipleCheckboxes_InReverseOrder 
{
	public static void main(String[] args) throws InterruptedException 
	 {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\Selenium1\\chromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement s1:checkboxes)
		{
			s1.click();
			Thread.sleep(1000);
		}
		
		for(int i=checkboxes.size()-1; i>=0;i--)
		{
			checkboxes.get(i).click();
			Thread.sleep(1000);
		}
		
		
		
}
}