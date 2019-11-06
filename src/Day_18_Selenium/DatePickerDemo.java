package Day_18_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		String month= "June 2019"; 
		String day="20";
		
		System.setProperty("webdriver.chrome.driver","C://Drivers/chromedriver_win32/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 String baseURL = "https://www.phptravels.net/";
		 
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.get(baseURL);
		 driver.manage().window().maximize();//Maximize WebPage..
		 
		 driver.findElement(By.xpath("//*[@name='checkin']")).click();//Opens date picker
         
		 while(true)
		 {
			 String text=driver.findElement(By.xpath("/html/body/div[10]/div[1]/table/thead/tr[1]/th[2]")).getText();
			 System.out.println(text);
			 
			 if(text.equals(month))
			 {
				 break;
			 }
			 else
				 {
					driver.findElement(By.xpath("/html/body/div[10]/div[1]/table/thead/tr[1]/th[3]")).click(); 
				 }
			 
		  }
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][1]/div/table/tbody/tr/td[contains(text(),"+day+")]")).click(); 
		 //driver.findElement(By.xpath("//table[@class='table-condensed']/tbody/tr/td[contains(text(),"+day+")]")).click();
	}

}
