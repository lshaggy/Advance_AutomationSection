package Day_14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BoostrapElements {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 String baseURL = "http://demo.automationtesting.in//Register.html";
		 

		 driver.get(baseURL);
		 driver.manage().window().maximize();//Maximize WebPage..
		 
//Multi select List box....
		 driver.findElement(By.xpath("//*[@id=\"msdd\"]")).click();
		 
		 Thread.sleep(8000);
		 
		 List <WebElement> langs=driver.findElements(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li/a"));
		 
		 System.out.println("Number of list item present in multi List box:"+langs.size());
		 
		 langs.get(0).click();
	//	 langs.get(5).click();
	//	 langs.get(7).click();
		 
		 Thread.sleep(5000);
//skills
		Select skills=new Select(driver.findElement(By.xpath("//*[@id='Skills']")));
		skills.selectByIndex(3);
					
     //country -dropdown
	    Select country=new Select(driver.findElement(By.xpath("//*[@id='countries']")));
		country.selectByValue("Algeria");
			
//Countries--Searchable DropDown
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")).click();
		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Japan");
		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.RETURN);//Press enter key action.
		 
		 

	}

}
