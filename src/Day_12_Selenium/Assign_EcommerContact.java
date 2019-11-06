package Day_12_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_EcommerContact {

	public static void main
	(String[] args) throws InterruptedException 
	{
//1) Open Web Browser(Chrome/IE/firefox).
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver");
		WebDriver driver = new ChromeDriver();//ChromeDriver driver= new ChromeDriver();
		String baseURL= ("https://www.hiremyteaminc.ca/");

//2) Open URL https://www.hiremyteaminc.ca/
		driver.get(baseURL);
		
		Thread.sleep(3000);
		
//3) Open drop-down and Select
		driver.findElement(By.partialLinkText("rces")).click();
		driver.findElement(By.partialLinkText("Cont")).click();
		
//4) Fill up form..
		driver.findElement(By.xpath("//input[@name='first-name']")).sendKeys("Shaggy");
		driver.findElement(By.xpath("//input[@name='your-email']")).sendKeys("Shaggy@youremail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("6472291234");
		driver.findElement(By.xpath("//input[contains(@value,'Customer')]")).click();
		driver.findElement(By.xpath("//textarea[@name='textarea-825']")).sendKeys("Business Influence");
		
	}


}
