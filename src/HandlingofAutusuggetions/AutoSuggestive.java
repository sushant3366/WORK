package HandlingofAutusuggetions;

import java.time.Duration;
import java.util.List;



import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;



public class AutoSuggestive {



public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub



System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\DELL\\\\\\\\\\\\\\\\Desktop\\\\\\\\\\\\\\\\Selenium1\\\\\\\\\\\\\\\\chromeDriver\\\\\\\\\\\\\\\\chromedriver_win32 (2)\\\\\\\\\\\\\\\\chromedriver.exe");

WebDriver driver =new ChromeDriver();
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");


driver.findElement(By.id("autosuggest")).sendKeys("ind");

Thread.sleep(3000);

List<WebElement> options =driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));

for(WebElement option :options)

{

if(option.getText().equalsIgnoreCase("India"))

{

option.click();

break;

}

}

}



}


