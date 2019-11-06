package Day_15_Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertsDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 String baseURL = "http://testautomationpractice.blogspot.com/";
		 

		 driver.get(baseURL);
		 driver.manage().window().maximize();//Maximize WebPage..
		 
//Verifying Ok functionality..
		 driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button")).click();
		 

		 Alert alertWindow=driver.switchTo().alert();
		 alertWindow.accept(); //Close popup window with Ok button
		 
		 String act_Text=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		 
		 if(act_Text.contains("You pressed OK!"))
		 {
			 System.out.println("Test Passed for Ok button");
		 }
		 else
		 {
			 System.out.println("Test Failed for Ok button");
		 }

//Verifying Cancel functionality..
		 driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button")).click();
		 

	//	 Alert alertWindow=driver.switchTo().alert();
		 Thread.sleep(5000);
		 driver.switchTo().alert().dismiss(); //Close popup window with Cancel button
		 
		 String act_msg=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		 
		 if(act_msg.equals("You pressed Cancel!"))
		 {
			 System.out.println("Test Passed for Cancel button");
		 }
		 else
		 {
			 System.out.println("Test Failed for Cancel button");
		 }
	}

}
