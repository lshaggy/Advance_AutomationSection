package Day_17_Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo2 {

	public static void main(String[] args) 
	{
	   	 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 String baseURL = "http://opensource-demo.orangehrmlive.com";
		 

		 driver.get(baseURL);
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.manage().window().maximize();//Maximize WebPage..
		 
//Login
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		 driver.findElement(By.id("btnLogin")).click();
		 
//Admin-->UserManagement-->User
		 driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
		 driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]")).click();
		 driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]")).click();
		 
		 int number_rows=driver.findElements(By.xpath("//table[@id=\"resultTable\"]/tbody/tr")).size();
		 System.out.println("Number of Rows is: "+number_rows);
		 int count=0;
		 
		 for(int r=1;r<=number_rows;r++)
		 {
	     String status=driver.findElement(By.xpath("//table[@id=\"resultTable\"]/tbody/tr["+r+"]/td[5]")).getText();
		 System.out.println(status);
		 
		 if(status.equals("Enabled"))
		    {
			 count++;
		    }
		 }
		 System.out.println("Number of status Enabled :"+count);
		 System.out.println("Number of status Disabled :"+(number_rows-count));

//Validation of the page..
		 if(count==8)
		 {
			 System.out.println("My test is Passed");
		 }
		 else
			 
		 {
			 System.out.println("My test is Failed");
		 }
		 
//Validation 2 of the page..
		 if((number_rows-count)==2)
		 {
			 System.out.println("My test is Passed");
		 }
		 else
			 
		 {
			 System.out.println("My test is Failed");
		 }
	}

}
