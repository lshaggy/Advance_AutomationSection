package Day_15_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_Frame_Text {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 String baseURL = "http://demo.automationtesting.in/Frames.html";
		 

		 driver.get(baseURL);
		 driver.manage().window().maximize();//Maximize WebPage..
		 
		 driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"singleframe\"]")));//Outer Frame
		 // driver.switchTo().frame(0);
		 
		 driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Selenium Frame Text");
		 

	}

}
