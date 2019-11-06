package Day_26_extentReports;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

public class LoginTest 
{
	WebDriver driver;
	
	@Test(priority=0)
	void openURL()
	{
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String currenturl=driver.getCurrentUrl();
		
		if(currenturl.contains("opensource-demo.orangehrmlive.com"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}
	
	@Test(priority = 1)
	void loginTest() throws InterruptedException {
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "OrangeHRM123");
	}
	
	
	
	@Test(priority=3, dependsOnMethods={"loginTest"})
	void CheckNoofEmployeesEnabled()
	{
		Assert.assertTrue(true);/// Create your own code later..
	}
	
	@AfterClass
	void closeBrowser() {
		driver.quit();
	}
	
	@AfterMethod
	public void captureScreen(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			TakesScreenshot ts=(TakesScreenshot) driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File trg=new File(System.getProperty("user.dir")+"\\Screenshots\\"+result.getName()+".png");
			FileUtils.copyFile(src, trg);
		}
		
	}

}
