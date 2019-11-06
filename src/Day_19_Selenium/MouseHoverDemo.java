package Day_19_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

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

		 WebElement admin=driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b"));
		 WebElement user_manage=driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]"));
		 WebElement users=driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]"));
		 
		 Actions act= new Actions(driver);
//Mouse Hover Action
		 act.moveToElement(admin).moveToElement(user_manage).moveToElement(users).click().build().perform();
		 
		 WebElement pim=driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b"));
		 WebElement employee=driver.findElement(By.xpath("//*[@id=\"menu_pim_viewEmployeeList\"]"));
		 
		 act.moveToElement(pim).moveToElement(employee).click().build().perform();
	}
	
}
