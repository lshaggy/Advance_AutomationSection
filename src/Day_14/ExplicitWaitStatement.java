package Day_14;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitStatement {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 String baseURL = "http://newtours.demoaut.com";
		 
		 WebDriverWait mywait= new WebDriverWait(driver,10000);
		 
		 driver.get(baseURL);
		 driver.manage().window().maximize();//Maximize WebPage..
		 
		 WebElement username = mywait.until(ExpectedConditions.presenceOfElementLocated(By.name("userName")));
	     username.sendKeys("mecury");
		 //	 driver.findElement(By.name("userName")).sendKeys("mecury");
		 driver.findElement(By.name("password")).sendKeys("mecury");
		 driver.findElement(By.name("login")).click();
		 
  //Oneway Radio Button...
		 
		 WebElement Onway_radio=mywait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[value=oneway]")));
	     Onway_radio.click();
		 //	 driver.findElement(By.cssSelector("input[value=oneway]")).click();
	     
	     driver.close();
	}

}
