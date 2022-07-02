package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex3 
{
	public static void main(String[] args) throws InterruptedException 
	{
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
//we dont have multiselect applition write now so assume it and learn concept
		
		
		
		
		
//		to select first option
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text);
//		             OR
		String text=s.getFirstSelectedOption().getText();
		System.out.println(text);
		
		
		
		
		
		
		
		
		
		
		
		
}
}