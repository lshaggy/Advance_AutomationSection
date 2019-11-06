package Day_19_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickOperation {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C://Drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		 String baseURL = "https://api.jquery.com/dblclick/";
		 
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.get(baseURL);
		 driver.manage().window().maximize();//Maximize WebPage..
		 
		 driver.switchTo().frame(0);// Switch to frame
		 
		 WebElement ele=driver.findElement(By.xpath("/html/body/div"));
   
		 Thread.sleep(5000);
		 Actions act= new Actions(driver);
		 
		 for(int i=1;i<=20;i++)//Perform click for 20times
		 {
		 act.doubleClick(ele).build().perform();//Double click action on Element
	     }
	}

}
