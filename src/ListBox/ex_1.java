package ListBox;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex_1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL\\\\Desktop\\\\Selenium1\\\\chromeDriver\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(2000);
		
		//step1: Identify listbox and store it in refrence variable
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		
		//step2: create object of select class which accept WebElement argument
		Select s=new Select(month);
		
//		s.selectByValue("3");
//		Thread.sleep(2000);
//
//		s.selectByVisibleText("Apr");
//		Thread.sleep(2000);

		s.selectByIndex(4);
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
