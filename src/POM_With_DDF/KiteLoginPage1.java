package POM_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM class1
public class KiteLoginPage1 
{
	//step1: declaration     globally
@FindBy(xpath = "//input[@id='userid']")      private WebElement UN;  //private WebElement UN=driver.findElement(By.xpath(""))
@FindBy(xpath = "//input[@id='password']")    private WebElement pwd;
@FindBy(xpath = "//button[text()='Login ']")  private WebElement Loginbtn;

public KiteLoginPage1(WebDriver driver)   //constructor
{
	PageFactory.initElements(driver, this);  //calling PageFactory class 
}

public void inpKiteLoginPage1Username(String unValue)
{
	UN.sendKeys(unValue);
}

public void inpKiteLoginPage1Password(String passValue)
{
	pwd.sendKeys(passValue);
}

public void ClckKiteLoginPage1Loginbtn()
{
	Loginbtn.click();
}




















}
