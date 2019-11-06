package Log4jLogging;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

/*
 DEBUG
 INFO - threshold
 WARN  - seen
 ERROR
 FATAL -seen 
 */
public class LoggingDemo 
{
		WebDriver driver;
		Logger logger;
		
		@BeforeClass
		void setup()
		{
			//Log4J setup
			logger=Logger.getLogger("LoggingDemo");
			PropertyConfigurator.configure("log4j.properties");
			logger.setLevel(Level.DEBUG);
			
			logger.debug("*********** driver is initiating ********************");
			System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver_win32//chromedriver.exe");
			driver = new ChromeDriver();
			//driver =null;
			
			if(driver == null)
			{
				logger.warn(" ************** Webdriver not initiated properly **********");
			}
			
			
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
			if(driver.getCurrentUrl().contains("opensource-demo.orangehrmlive"))
			{
				logger.info("****** URL is opened successfully.****");
				logger.debug("****** Home page is displayed ********************");
			}
			else
			{
				logger.fatal("******* URL is not opened ******");
			}
			
		}
		
		@Test
		void login()
		{
			logger.info("******* Login test started ************");
			logger.info("******* Providing user login details************");
			
			
			driver.findElement(By.name("txtUsername")).sendKeys("Admin");
			logger.debug("****** Entering user name ********************");
			
			
			driver.findElement(By.name("txtPassword")).sendKeys("admin123");
			logger.debug("****** Entering password ********************");
			
			
			driver.findElement(By.name("Submit")).click();
			logger.debug("****** clicking on Submit ********************");
			
			logger.info("******* Login validation started************");
			
			if(driver.getTitle().equals("OrangeHRM"))
			{
				logger.info("********* Login is succesfull***************");
				Assert.assertTrue(true);	
			}
			else
			{
				logger.error("********* Login is not succesfull ***************");
				Assert.assertTrue(false);
			}
		}
		@AfterClass
		void tearDown()
		{
			logger.info("********** test case execution is completed ******************");
			driver.close();
		}
}
