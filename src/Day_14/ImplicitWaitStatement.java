package Day_14;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitStatement {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 String baseURL = "http://newtours.demoaut.com";
		 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//Implicit Statement 

		 driver.get(baseURL);
		 driver.manage().window().maximize();//Maximize WebPage..
		 
		 driver.findElement(By.name("userName")).sendKeys("mecury");
		 driver.findElement(By.name("password")).sendKeys("mecury");
		 
		 driver.findElement(By.name("login")).click();
		 
		// Thread.sleep(5);
  //Oneway Radio Button...
		 driver.findElement(By.cssSelector("input[value=oneway]")).click();
	}

}
