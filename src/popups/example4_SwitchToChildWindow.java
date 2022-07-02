package popups;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example4_SwitchToChildWindow 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL\\\\Desktop\\\\Selenium1\\\\chromeDriver\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://skpatro.github.io/demo/links/");
	
		//click on newtab from main page
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		//get childwindow ID/address
		Set<String> all_IDS = driver.getWindowHandles();  //[mainPageID, childWindowID] .....(3)
		System.out.println(all_IDS);
		
		ArrayList<String> al = new ArrayList<String> (all_IDS);                    //........(4)
		
		String childWindowID = al.get(1);                                          //........(5)
		
		
		//switch to childwindow
		driver.switchTo().window(childWindowID);   //String childWindowID        //..........(2)
		                                          
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
	                                                                               //........(1)
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	}
}
