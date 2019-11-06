package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{

	WebDriver ldriver;
	
	
	LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver,this);
	}
	
	//Page elements
	
	//Approach1
	/*@FindBy(name="userName") 
	WebElement txtusername;*/
	
	//Approach2
	@FindBy(how=How.NAME, using="userName")
	WebElement txtusername;
	
		
	@FindBy(name="password")
	WebElement txtpassword;
	
	
	@FindBy(name="login")
	WebElement btnsign;
	
	//Action methods
	
	
	void setUserName(String uname)
	{
		txtusername.sendKeys(uname);
	}
	
	
	void setPassword(String pwd)
	{
		txtpassword.sendKeys(pwd);
	}
	
	void clickSubmit()
	{
		btnsign.click();
	}
}
