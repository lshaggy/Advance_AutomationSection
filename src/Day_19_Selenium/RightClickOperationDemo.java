package Day_19_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickOperationDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 String baseURL = "https://swisnl.github.io/jQuery-contextMenu/demo.html";
		 
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.get(baseURL);
		 driver.manage().window().maximize();//Maximize WebPage..
		 
		 WebElement button=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
         
		 Actions act= new Actions(driver);
		 
		 act.contextClick(button).build().perform(); //Right click operation on the button
		 driver.findElement(By.xpath("/html/body/ul/li[3]/span")).click();//Copy
		  
		 Thread.sleep(5000);
		 
		 Alert alert=driver.switchTo().alert();//Popups
		 alert.getText();
		 System.out.println(alert.getText());//Capture text from alert window
		 alert.accept();//Close alert box by clicking ok
		 
		 driver.close();
	}

}
