package Day_15_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assgin_RetrievePopupMsg {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 String baseURL = "http://mail.rediff.com/cgi-bin/login.cgi";
		 

		 driver.get(baseURL);
		 driver.manage().window().maximize();//Maximize WebPage..

	}

}
