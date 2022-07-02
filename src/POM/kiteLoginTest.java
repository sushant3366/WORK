package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
  //Test class
public class kiteLoginTest 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL\\\\Desktop\\\\Selenium1\\\\chromeDriver\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
	
	
		KiteLoginPage1 login1=new KiteLoginPage1(driver);
		login1.inpKiteLoginPage1Username();
		login1.inpKiteLoginPage1Password();
		login1.ClckKiteLoginPage1Loginbtn();
		
		kiteLogin2Page login2=new kiteLogin2Page(driver);
		login2.inpkiteLogin2PagePin();
		login2.ClickkiteLogin2PageCntBtn();
		
		kiteHomePage home=new kiteHomePage(driver);
		home.VerifykiteHomePageUserID();
		
		Thread.sleep(2000);
		driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
