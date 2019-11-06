package Day_14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 String baseURL = "http://output.jsbin.com/osebed/2";
		 

		 driver.get(baseURL);
		 driver.manage().window().maximize();//Maximize WebPage..
		 
		 Select listb =new Select(driver.findElement(By.id("fruits")));
		 
		 listb.selectByVisibleText("Apple");// Selected
		 listb.selectByVisibleText("Grape");

		 Thread.sleep(3000);
		 
		 listb.deselectByVisibleText("Apple");//Deselected
		 listb.selectByVisibleText("Orange");

		 driver.close();
	}

}
