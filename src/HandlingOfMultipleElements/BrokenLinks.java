package HandlingOfMultipleElements;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium1\\chromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		//https://demo.guru99.com/test/newtours/
		
		Thread.sleep(3000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++)
		{
			//by using href attribute we can get URL of required link
			WebElement element = links.get(i);
			String url = element.getAttribute("href");
			
			URL link=new URL(url);
			
			//create connection using url object 'link'
			HttpURLConnection httpconn = (HttpURLConnection) link.openConnection();
			
//			Thread.sleep(4000);
			httpconn.connect();
			
			int rescode = httpconn.getResponseCode();
		
			if(rescode>=400)
			{
				System.out.println("The link with text "+element.getText());
				System.out.println(rescode+" "+url +" - "+" is broken link");
				
			}
			else
			{
				System.out.println(rescode+" "+url +" - "+ " is valid link");
			}
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
