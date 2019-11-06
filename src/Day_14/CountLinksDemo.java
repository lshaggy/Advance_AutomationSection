package Day_14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLinksDemo {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 String baseURL = "http://newtours.demoaut.com";
		 

		 driver.get(baseURL);
		 driver.manage().window().maximize();//Maximize WebPage..
		 
		 List <WebElement> links = driver.findElements(By.tagName("a"));
		 System.out.println("Total number of links on this page is: "+links.size());// Prints number of links present on the webPage //16
		 
	 //Retrieving all the links using (Enhanced for loop) and print them in console window
		 for(WebElement optn:links)
		 {
			 System.out.println("List of all the links on this page: "+optn.getText());
		 }
		 
	//Link Validation..
		 driver.findElement(By.linkText("REGISTER")).click();
		if( driver.getCurrentUrl().contains("http://newtours.demoaut.com/mercuryregister.php"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
			
		}
		 
		 
		 
	//	 driver.close();

	}

}
