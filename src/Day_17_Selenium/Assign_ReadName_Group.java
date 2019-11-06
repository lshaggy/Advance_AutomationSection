package Day_17_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_ReadName_Group {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 String baseURL = "https://money.rediff.com/gainers/bse/daily/";
		 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.get(baseURL);
		 driver.manage().window().maximize();//Maximize WebPage..
		 
		 driver.findElement(By.linkText("Group M")).click();// ("//strong[contains(text(),'Group M   |')]"));
//Retrieve data..
		 String cname=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[2]")).getText();

		 for(int r=1;r<=20;r++)
		 {
			 System.out.println(cname);
		 }
	}

}
