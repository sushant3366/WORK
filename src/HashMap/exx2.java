package HashMap;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exx2 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium1\\chromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://demo.guru99.com/test/newtours/");
	
		System.out.println(getCredentials());
		System.out.println(getCredentials().get("User"));//ravi:5566
		
		
		driver.findElement(By.name("userName")).sendKeys(getUserName("User"));
		driver.findElement(By.name("password")).sendKeys(getPassword("User"));

	}
	
		public static HashMap<String,String> getCredentials()
	{
		HashMap<String,String> mp=new HashMap<String,String>();
		mp.put("Customer", "sushant:Test@123"); //key,value   value-username:password
		mp.put("Admin", "vikas:vik@1234");
		mp.put("User", "ravi:5566");
		mp.put("Seller", "suresh:sr@4533");
		                  
		return mp;
	}
		
		public static String getUserName(String role)
		{
			String credentials = getCredentials().get(role);
			return credentials.split(":")[0];
		}
		
		public static String getPassword(String role)
		{
			String credentials = getCredentials().get(role);
			return credentials.split(":")[1];
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

