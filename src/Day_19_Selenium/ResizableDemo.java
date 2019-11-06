package Day_19_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizableDemo {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver","C://Drivers/chromedriver_win32/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 String baseURL = "https://jqueryui.com/resizable/";
		 
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.get(baseURL);
		 driver.manage().window().maximize();//Maximize WebPage..
		 
		 driver.switchTo().frame(0);
		 
		 WebElement ele=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		 
		 Actions act = new Actions(driver); 
		 
		 act.moveToElement(ele).dragAndDropBy(ele, 100, 1000).build().perform();
		 

	}

}
