package Day_11_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
	1) Open Web Browser(Chrome/IE/firefox).
	2) Open URL  https://admin-demo.nopcommerce.com/
	3) Enter username  (Admin@yourstore.com).
	4) Enter password  (admin).   
	5) Click on LogIn.
	6) Capture title of the home page.(Actual title)
	7) Verify  (Validate) title of the page: Dashboard / nopCommerce administration    (Expected)

*/

public class Assign_Selenium_LoginTestcase {

	public static void main(String[] args) 
	{
//1) Open Web Browser(Chrome/IE/firefox).
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver");
				WebDriver driver = new ChromeDriver();//ChromeDriver driver= new ChromeDriver();
				String baseURL= ("https://admin-demo.nopcommerce.com/");
				
//2) Open URL https://opensource-demo.orangehrmlive.com/
				driver.get(baseURL);
				
//3) Enter username  (Admin@yourstore.com). //Syntax to find Xpath -->Tagname[@attribute name=value]
				driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("Admin@yourstore.com");
				
//4) Enter password  (admin)
				driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("admin");
				
//5) Click on LogIn.
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				
//6) Capture title of the home page.(Actual title)
		        //driver.getTitle();
		        
		        String act_title = driver.getTitle();
		        String exp_title = "Dashboard / nopCommerce administration";
				
//7) Verify  (Validate) title of the page: Dashboard / nopCommerce administration    (Expected)
		        if(act_title.equals(exp_title))
		        {
		        	System.out.println("Test Passed");
		        }
		        else
		        {
		        	System.out.println("Test Failed");
		        }
//8) Close browser...
		        driver.close();
	}

}
