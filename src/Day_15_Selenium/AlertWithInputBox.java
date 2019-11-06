package Day_15_Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithInputBox {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 String baseURL = "http://demo.automationtesting.in/Alerts.html";
		 

		 driver.get(baseURL);
		 driver.manage().window().maximize();//Maximize WebPage..
		 driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		 driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		 
		 Alert alert_window=driver.switchTo().alert();
		 
		 alert_window.sendKeys("John"); //Provide value for the input box
		 alert_window.accept();//close alert window with ok button
		 
		 String act_txt=driver.findElement(By.xpath("//*[@id=\"demo1\"]")).getText();// 
		 
		 if(act_txt.contains("Hello John How are you today"))
		 {
			 System.out.println("Test Passed");
		 }
		 else
		 {
			 System.out.println("Test Failed");
		 }
		 

	}

}
