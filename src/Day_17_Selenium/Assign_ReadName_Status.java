package Day_17_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_ReadName_Status {

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
		 
//Length of rows & columns..
		 int number_rows=driver.findElements(By.xpath("//table[@id=\"resultTable\"]/tbody/tr")).size();
		 System.out.println("Number of Rows is: "+(number_rows-1));//9
		 int number_columns=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr[1]/td")).size();
		 System.out.println("Number of Column is: "+(number_columns-1));//4
		 
		 for(int r=1;r<=number_rows;r++)
		 {
			
		 String values =driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+r+"]/td[4]")).getText();
		 String status=driver.findElement(By.xpath("//table[@id=\"resultTable\"]/tbody/tr["+r+"]/td[5]")).getText();
	//	 System.out.println(status);
		 
		 System.out.println("Employee Name is: "+values+"  ||"+"Status is:  " +status);    
		
		 }
	}

}
