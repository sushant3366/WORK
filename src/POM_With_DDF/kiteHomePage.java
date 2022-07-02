package POM_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM class3
public class kiteHomePage
{
@FindBy(xpath = "//span[@class='user-id']")	private WebElement userid;


public kiteHomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}

public void VerifykiteHomePageUserID(String expUserID)
{
	String actualUserID = userid.getText();
	
	if (actualUserID.equals(expUserID)) 
	{
	System.out.println("pass");		
	}
	else
	{
		System.out.println("fail");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}





















}