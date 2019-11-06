package Day_15_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign_SwitchToF {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 String baseURL = "http://testautomationpractice.blogspot.com/";
		 

		 driver.get(baseURL);
		 driver.manage().window().maximize();//Maximize WebPage..
		 
		 driver.switchTo().frame(0);
		 driver.findElement(By.name("RESULT_TextField-1")).sendKeys("Shaggy");
		 driver.findElement(By.name("RESULT_TextField-2")).sendKeys("Louis");
		 driver.findElement(By.name("RESULT_TextField-3")).sendKeys("^238817365");
		 driver.findElement(By.name("RESULT_TextField-4")).sendKeys("Canada");
		 driver.findElement(By.name("RESULT_TextField-5")).sendKeys("Toronto");
		 driver.findElement(By.name("RESULT_TextField-6")).sendKeys("Shaggy@gmail.com");
		 
		 WebElement dropdown=driver.findElement(By.name("RESULT_RadioButton-7"));
		 Select day = new Select(dropdown);
		 day.selectByIndex(2);//Afternoon
		 
		 driver.findElement(By.id("RESULT_RadioButton-8_0")).click();//Male
		 
		 driver.findElement(By.xpath("//input[@value='CheckBox-6']")).click();//Saturday..
		 
		 driver.findElement(By.id("RESULT_TextField-10")).click();// Date..
		 driver.findElement(By.xpath("//*[@id=\"RESULT_TextArea-12\"]")).sendKeys("Is not working");
		 

	}

}
