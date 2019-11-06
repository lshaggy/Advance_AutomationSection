package Day_11_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/*
    1) Open Web Browser(Chrome/IE/firefox).
	2) Open URL  https://opensource-demo.orangehrmlive.com/
	3) Enter username  (Admin).
	4) Enter password  (admin123).   
	5) Click on Login.
	6) Capture title of the home page.(Actual title)
	7) Verify title of the page: OrangeHRM    (Expected)
 
 */


public class FirstTestCase {

	public static void main(String[] args) 
	{
//1) Open Web Browser(Chrome/IE/firefox).
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver");
		
	/*	DesiredCapabilities capabilities= DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        WebDriver driver = new FirefoxDriver(capabilities);  */
		
		WebDriver driver = new ChromeDriver();//ChromeDriver driver= new ChromeDriver();
		
//2) Open URL https://opensource-demo.orangehrmlive.com/
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
//3) Enter username  (Admin).
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		
//4) Enter password		
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
//5) Click on Login.
		driver.findElement(By.name("Submit")).click();
		
//6) Capture title of the home page.(Actual title)
		String act_title = driver.getTitle();
		String exp_title = "OrangeHRM";
		
//7) Verify title of the page: OrangeHRM    (Expected)
		if(act_title.equals(exp_title))
		{
			System.out.println("Test Passed");
		}
		else
			
		{
			System.out.println("Test Failed");
		}
		
//8) Close Browser..
		driver.close();
	}

}
