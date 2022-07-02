package popups;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example4_SwitchToMainPage_From_ChildWindow 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium1\\chromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://skpatro.github.io/demo/links/");
	
		//click on newtab from main page
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		Set<String> all_IDs = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String> (all_IDs);    //[mainPageID(0), childWindowID(1)]
		
		//switch to childwindow
		driver.switchTo().window(al.get(1));
		
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		Thread.sleep(2000);
		//switch to main page
		driver.switchTo().window(al.get(0));
		
		//click on new window
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}