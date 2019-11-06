package Day_25_Parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.*;

/*
 * 
setup()  ---> configuration  @BeforeClass
logoTest() ---> selenium script   @Test
homePagetitle() --> selenium script  @Test
tearDown() --> closing activities  @AfterClass
 */

public class ParametersExample {

	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser","url"})
	void setup(String br,String app) throws InterruptedException
	{
		if(br.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","C://Drivers/chromedriver_win32/chromedriver.exe");
        driver=new ChromeDriver();
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C://Drivers/geckodriver-v0.24.0-win64/geckodriver.exe");
	        driver=new FirefoxDriver();
		}
		else if(br.equals("ie"))
		{
			 System.setProperty("webdriver.ie.driver", "C://Drivers/IEDriverServer_Win32_3.14.0/IEDriverServer.exe");
			 driver=new InternetExplorerDriver(); 
		}
        driver.get(app);
        Thread.sleep(8000);
	}
	
	@Test(priority=1)
	void logoTest()
	{
		WebElement logo=driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
		Assert.assertTrue(logo.isDisplayed());
	}
	
	@Test(priority=2)
	void homePageTitleTest()
	{
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}

}
