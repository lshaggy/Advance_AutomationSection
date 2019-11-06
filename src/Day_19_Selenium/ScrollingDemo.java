package Day_19_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 String baseURL = "https://www.countries-ofthe-world.com/flags-of-the-world.html";
		 
  //       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		 driver.get(baseURL);
		 driver.manage().window().maximize();//Maximize WebPage..
		 

		 JavascriptExecutor js =(JavascriptExecutor)driver;//Type casting concept..
		
//First Approach..--> Pixel..
	/*	 js.executeScript("window.scrollBy(0,2000)"," ");//Scroll page till reaches 1000 pixel
		 
		 Long value=(Long) js.executeScript("return window.pageYOffset;" );
		 System.out.println(value);//2000 */
		 
//Second Approach..--> Pixel..Sroll to Canada Flag
	/*	 WebElement flag=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/table[1]/tbody/tr[35]/td[1]/img"));
		 
		 js.executeScript("arguments[0].scrollIntoView();" ,flag);
		 Long value=(Long) js.executeScript("return window.pageYOffset;" );
		 System.out.println(value);//2235  */
		 
//Third Approach..--> Pixel..Scrool till the end of the Page..
		 js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		 Thread.sleep(5000);
//Fourth Approach..--> Pixel..Scrool back to first Position on the Page..
		 
		 js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
	}

}
