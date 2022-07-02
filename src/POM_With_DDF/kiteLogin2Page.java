package POM_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//POM class2
public class kiteLogin2Page 
{
	//Declaration
@FindBy(xpath = "//input[@id='pin']")	        private WebElement pin;
@FindBy(xpath = "//button[text()='Continue ']")	private WebElement cntbtn;

public kiteLogin2Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void inpkiteLogin2PagePin(String pinValue)
{
	pin.sendKeys(pinValue);
}

public void ClickkiteLogin2PageCntBtn()
{
	cntbtn.click();
}

















}
