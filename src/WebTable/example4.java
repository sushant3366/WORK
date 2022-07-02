package WebTable;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example4
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium1\\chromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		int RowSize = driver.findElements(By.xpath("//table[@class='dataTable']//tr")).size();
		
		System.out.println(RowSize);
		int columnSize = driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]/th")).size();
	
		System.out.println(columnSize);
		
		String text = driver.findElement(By.xpath("//table[@class='dataTable']//tr[3]/td[3]")).getText();
		
		System.out.println(text);
	
	
	
	
	
	
	}
}