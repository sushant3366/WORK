package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex5_getAllOptions_InAListbox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium1\\chromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
//		click on create new account
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	    Thread.sleep(2000);
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
	
		Select s=new Select(month);
		List<WebElement> allOptions=s.getOptions();
		
		for(WebElement s1:allOptions)
		{
			System.out.println(s1.getText());
		}
		
		int size=s.getOptions().size();
		System.out.println(size);
		
		driver.close();
		
		
		
		
		
		
}
}