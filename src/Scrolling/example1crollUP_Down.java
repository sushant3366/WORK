package Scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1crollUP_Down 
{
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\DELL\\\\\\\\Desktop\\\\\\\\Selenium1\\\\\\\\chromeDriver\\\\\\\\chromedriver_win32 (1)\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		// down --> 2nd parameter +ve value
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)");

		Thread.sleep(3000);
		
		// up --> 2nd parameter -ve value
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-500)");

//		Thread.sleep(3000);
//		//right  --> 1st parameter +ve value
//		((JavascriptExecutor)driver).executeScript("window.scrollBy(300,0)");
//		
//		
//		Thread.sleep(3000);
//		//left  --> 1st parameter -ve value
//		((JavascriptExecutor)driver).executeScript("window.scrollBy(-300,0)");
//		

}
}