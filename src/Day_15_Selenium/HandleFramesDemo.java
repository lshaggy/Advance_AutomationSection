package Day_15_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFramesDemo {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 String baseURL = "http://seleniumhq.github.io/selenium/docs/api/java/index";
		 

		 driver.get(baseURL);
		 driver.manage().window().maximize();//Maximize WebPage..
		 
	//First Frame
		 driver.switchTo().frame("packageListFrame"); //Switch to the Frame
		 driver.findElement(By.linkText("org.openqa.selenium")).click();//Perform action 
		 driver.switchTo().defaultContent();//Switch back to web page
		

	//Second Frame
		 driver.switchTo().frame("packageFrame"); //Switch to the Frame
		 driver.findElement(By.linkText("WebDriver")).click();//Perform action
		 driver.switchTo().defaultContent();//Switch back to web page
		 
	//Third Frame
		 driver.switchTo().frame("classFrame"); //Switch to the Frame
		 driver.findElement(By.xpath("/html/body/div[1]/ul/li[6]/a")).click();//Perform action
		 //driver.switchTo().defaultContent();//Switch back to web page

	}

}
