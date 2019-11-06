package Day_24_AnnotationDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class AssertionExamples 
{
WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		System.setProperty("webdriver.chrome.driver","C://Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test
	void logoTest()
	{
		WebElement logo=driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
		Assert.assertTrue(logo.isDisplayed());
		
	}
	
	@Test
	void homePageTitleTest()
	{
		String title=driver.getTitle();
		
		Assert.assertEquals("OrangeHRM123",title,"Titles are not same..");
				
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}

}
