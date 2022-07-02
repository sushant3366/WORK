package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_AlertPopup
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL\\\\Desktop\\\\Selenium1\\\\chromeDriver\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		////gettext from alert popup
		String txt = driver.switchTo().alert().getText();
		System.out.println(txt);
		
		//click on cancel button from alert popup
//		driver.switchTo().alert().dismiss();
		
		//click on OK button from alert popup
		driver.switchTo().alert().accept();
	
		Thread.sleep(3000);
//		driver.switchTo().alert().accept();

	
}
}