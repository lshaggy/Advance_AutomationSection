package Day_25_Parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class DataProviderExample
{
WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		System.setProperty("webdriver.chrome.driver","C://Drivers/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@Test(dataProvider="users")
	void loginTest(String uname,String pwd)
	{
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
		
		String act_title=driver.getTitle();
		String exp_title="Find a Flight: Mercury Tours:";
		
		Assert.assertEquals(exp_title, act_title);
	}
	
	@DataProvider(name="users")
	String[][] loginData()
	{
		String data[][]= { {"mercury","mercury"}, {"merc","mer"},{"mercury","mer"}};
		return data;
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
	

}
