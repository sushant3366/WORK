package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex4_getAllSelectedOptions_InMultipleSelectableListbox 
{
public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium1\\chromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("file:///C:/Users/sanjay/Desktop/Study/Selenium_Syallabus/OCT%2030B%20Selenium%20Soft/Html%20Files/sample4_Listbox.html");

		
		//step1: 
		WebElement selectCountry = driver.findElement(By.xpath("//select[@id='1234']"));
				
		//step2:
		Select s=new Select(selectCountry);
		
		s.selectByIndex(3);
		s.selectByIndex(1);
		s.selectByIndex(2);
		
		
		 List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		
		
		for(WebElement s2: allSelectedOptions) 
		{
			System.out.println(s2.getText());
		}
		
		int size = s.getAllSelectedOptions().size();
		System.out.println(size);
		
		
		
		
		
		
		
		
		
		
}
}