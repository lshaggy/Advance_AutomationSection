package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class LoginTest 
{

	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
	}
	
	@Test
	void login()
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName("mercury");
		lp.setPassword("mercury");
		lp.clickSubmit();
		
		//Validation
	}
	
	@AfterClass
	void tearDown()
	{
		driver.close();
	}
}
