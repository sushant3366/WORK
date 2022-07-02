package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_with_DDF 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium1\\chromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		FileInputStream file=new FileInputStream("C:\\Users\\DELL\\Desktop\\Selenium1\\demo Excel\\FrameworkExcel.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
				
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
		
		String username = sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(username);
		
		String password = sh.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[text()='Login ']")).click();

		String pin = sh.getRow(0).getCell(2).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(pin);
		
		driver.findElement(By.xpath("//button[text()='Continue ']")).click();
		
		//get act user id
		String actualUserID = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
		
		String expectedUserID = sh.getRow(0).getCell(3).getStringCellValue();
		if(actualUserID.equals(expectedUserID))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		Thread.sleep(4000);
		
		driver.close();

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}