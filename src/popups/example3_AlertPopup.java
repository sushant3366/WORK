package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3_AlertPopup
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL\\\\Desktop\\\\Selenium1\\\\chromeDriver\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/delete_customer.php");

	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	Alert alt = driver.switchTo().alert();
	String txt = alt.getText();
	System.out.println(txt);
	
	alt.accept();
	
//	Thread.sleep(4000);
	alt.accept();
}
}